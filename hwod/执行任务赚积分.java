import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 执行任务赚积分 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int t = sc.nextInt();

        int[][] wos = new int[n][2];
        for (int i = 0; i < n; i++) {
            wos[i][0] = sc.nextInt();
            wos[i][1] = sc.nextInt();
        }

        System.out.println(getResult(wos, t));
    }

    public static int getResult(int[][] wos, int t) {
        Arrays.sort(wos, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);
        int ans = 0, curTime = 0;
        for (int[] x : wos) {
            int endTime = x[0];
            int score = x[1];
            if (curTime < endTime) {
                queue.add(score);
                curTime++;
                ans += score;
            } else {
                if (queue.size() == 0) continue;
                int preScore = queue.peek();
                if (score > preScore) {
                    queue.poll();
                    ans = ans - preScore + score;
                    queue.add(score);
                }
            }
        }
        while (queue.size() > t && t > 0) {
            ans -= queue.poll();
        }
        return ans;
    }
}
