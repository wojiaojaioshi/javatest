import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 跳格子3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] scores = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(sc.nextLine());

        System.out.println(getResult(n, scores, k));
    }

    public static int getResult(int n, int[] scores, int k) {
        // 第i个格子，可以从第i-k个格子~第i-1个格子调过来，因此本题滑窗的长度相当于k+1

        // dp[i]表示跳到第i个格子能得到的最大分数
        int[] dp = new int[n];
        dp[0] = scores[0];

        // 单调队列（单调递减，队首是滑窗最大值）
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(dp[0]);
        for (int i = 1; i <= Math.min(k, n - 1); i++) {
            dp[i] = queue.getFirst() + scores[i];
            while (queue.size() > 0 && queue.getLast() < dp[i]) {
                queue.removeLast();
            }
            queue.addLast(dp[i]);
        }
        for (int i = k + 1; i < n; i++) {
            if (queue.getFirst() == dp[i - (k + 1)]) {
                queue.removeFirst();
            }
            dp[i] = queue.getFirst() + scores[i];
            while (queue.size() > 0 && queue.getLast() < dp[i]) {
                queue.removeLast();
            }
            queue.addLast(dp[i]);
        }

        return dp[n - 1];
    }
}
