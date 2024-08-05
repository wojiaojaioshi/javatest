package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

public class 数组连续和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int dp[] = new int[n + 1];
        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            dp[i] = dp[i - 1] + nums[i - 1];
        }
        int l = 0, r = 1;
        while (r <= n) {
            if (dp[r] - dp[l] >= k) {
                ans += n - r + 1;
                l++;
                r = l + 1;
            } else {
                r++;
            }
        }
        System.out.println(ans);
    }
}
