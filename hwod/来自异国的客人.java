import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 来自异国的客人 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long n = sc.nextLong();
        long m = sc.nextLong();

        List<String> ans = new ArrayList<>();
        while (k >= m) {
            ans.add(0, String.valueOf(k % m));
            k /= m;
        }
        ans.add(0, String.valueOf(k));
        long sum = ans.stream().filter(x -> x.equals(String.valueOf(n))).count();
        System.out.println(sum);
    }
}
