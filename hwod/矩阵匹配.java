import java.util.Arrays;
import java.util.Scanner;

public class 矩阵匹配 {
    static int n;
    static int m;
    static int k;
    static int[][] matrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int min = 1;
        int max = Integer.MIN_VALUE;

        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                max = Math.max(max, matrix[i][j]);
            }
        }

        // 二分枚举第K大值
        while (min <= max) {
            // mid就是被枚举出来的N个数中的第K大值
            int mid = (min + max) >> 1;

            // 检查mid作为N个数中第K大值时，是否存在N-K+1个不大于它的值
            if (check(mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min);
    }

    public static boolean check(int kth) {
        int[] match = new int[m];
        Arrays.fill(match, -1);
        int smallCount = 0;
        for (int i = 0; i < n; i++) {
            boolean[] vis = new boolean[m];
            if (dfs(i, kth, match, vis)) smallCount++;
        }
        return smallCount >= n - k + 1;
    }

    public static boolean dfs(int i, int kth, int[] match, boolean[] vis) {
        for (int j = 0; j < m; j++) {
            if (!vis[j] && matrix[i][j] <= kth) {
                vis[j] = true;
                if (match[j] == -1 || dfs(match[j], kth, match, vis)) {
                    match[j] = i;
                    return true;
                }
            }
        }
        return false;
    }
}
