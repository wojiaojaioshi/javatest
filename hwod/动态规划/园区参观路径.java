package 动态规划;

import java.util.Scanner;

public class 园区参观路径 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long[][] roads = new long[m][n];
        long dp[][] = new long[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                roads[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            if (roads[i][0] == 0) {
                dp[i][0] = 1;
            }else break;
        }
        for (int i = 0; i < n; i++) {
            if (roads[0][i] == 0) {
                dp[0][i] = 1;
            }else break;

        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (roads[i][j] != 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        if (roads[m - 1][n - 1] == 1) {
            System.out.println(0);
        } else {
            System.out.println(dp[m - 1][n - 1]);
        }
    }
}
