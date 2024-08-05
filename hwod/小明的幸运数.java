import java.util.Scanner;

public class 小明的幸运数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0, cur = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            int path = sc.nextInt();
            if (path > 100 || path < -100 || m < -100 || m > 100 || n > 100) {
                flag = 1;
                System.out.println(12345);
                break;
            }
            if (path == m) {
                if (path != 0) {
                    cur += path < 0 ? path - 1 : path + 1;
                }
            } else {
                cur += path;
            }
            ans = Math.max(ans, cur);
        }
        if (flag == 0) {
            System.out.println(ans);
        }


    }
}
