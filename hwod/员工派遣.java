import java.util.Scanner;

public class 员工派遣 {
    static long x;
    static long y;
    static long cntx;
    static long cnty;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        cntx = sc.nextInt();
        cnty = sc.nextInt();

        // 使用此范围，实际通过率55%
        //  long min = cntx + cnty;
        //  long max = Long.MAX_VALUE;

        // 使用此范围，实际通过率可以100%
        long min = 1;
        long max = 1000000000L;

        while (min <= max) {
            long mid = min + (max - min) / 2;

            if (check(mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min);
    }

    public static boolean check(long k) {
        long A = k / x; // 1~k范围内x倍数的数量
        long B = k / y; // 1~k范围内y倍数的数量
        long C = k / (x * y); // 1~k范围内x*y倍数的数量
        //    判断x国和y国的需求是否仅靠(纯y的倍数->x，纯X的倍数->y)如果不能，则用剩余的既不是x也不是y的倍数的数来提供
        return Math.max(0, cntx - (B - C)) + Math.max(0, cnty - (A - C)) <= k - A - B + C;
    }
}
