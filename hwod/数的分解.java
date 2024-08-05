import java.util.Scanner;
import java.util.StringJoiner;

public class 数的分解 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        if (n <= 2) System.out.println("N");
        else System.out.println(solution(n));
    }

    public static String solution(long n) {
        long l = 1, r = 2, sum = l + r, minLen = Integer.MAX_VALUE;
        StringJoiner sj = new StringJoiner("+", n + "=", "");
        long minL = 0, minR = 0;
        while (r < n) {
            if (sum < n) {
                sum += ++r;
            } else if (sum > n) {
                sum -= l++;
            } else {
                long len = r - l + 1;
                if (len < minLen) {
                    minL = l;
                    minR = r;
                }
                sum -= l++;
            }
        }
        for (long i = minL; i <= minR; i++) {
            sj.add(String.valueOf(i));
        }
        return sj.toString();
    }
}
