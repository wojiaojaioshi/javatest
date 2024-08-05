import java.util.Scanner;

public class 分月饼 {

    static int m;
    static int n;
    static int maxDiff = 3;
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        if (m == 1) {
            System.out.println(1);
        } else {
            dfs(0, 1, n / m, n);
            System.out.println(ans);
        }
    }

    public static void dfs(int index, int min, int max, int remain) {
        if (index == m - 1) {
            if (remain <= maxDiff + min) {
                ans++;
            }
            return;
        }
        for (int i = min; i <= max; i++) {
            remain -= i;
            dfs(index + 1, i, Math.min(i + maxDiff, remain / (m - 1 - index)), remain);
            remain += i;
        }
    }
}
