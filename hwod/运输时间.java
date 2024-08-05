import java.text.NumberFormat;
import java.util.Scanner;

public class 运输时间 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 0; i < m; i++) {
            double v = sc.nextDouble();
            double t = (n / v) + i;
            ans = Math.max(t, ans);
        }

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(ans - (m - 1)));
    }
}
