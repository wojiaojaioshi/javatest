
import java.util.Arrays;
import java.util.Scanner;

public class Wonderland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] costs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] days = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 最大游玩日
        int maxDay = days[days.length - 1];

        // dp[i] 表示 前i天中完成其中所有游玩日需要的最少花费
        int[] dp = new int[maxDay + 1]; // dp[0] 默认为 0, 表示前0天花费0元

        // index用于指向当前需要完成的游玩日days[index]
        int index = 0;

        // 遍历第1天~第maxDay天
        for (int i = 1; i <= maxDay; i++) {
            if (i == days[index]) {
                int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE, buy3 = Integer.MAX_VALUE, buy4 = Integer.MAX_VALUE;
                buy1 = i >= 1 ? dp[i - 1] + costs[0] : costs[0];
                buy2 = i >= 3 ? dp[i - 3] + costs[1] : costs[1];
                buy3 = i >= 7 ? dp[i - 7] + costs[2] : costs[2];
                buy4 = i >= 30 ? dp[i - 30] + costs[3] : costs[3];
                dp[i] = Math.min(Math.min(Math.min(buy1, buy2), buy3), buy4);
                index++;
            } else {
                dp[i] = dp[i - 1];
            }
        }
        System.out.println(dp[maxDay]);
    }
}
