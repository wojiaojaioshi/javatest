import java.util.*;
import java.util.stream.Collectors;

public class 整数对最小和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = sc.nextInt(), ans = 0;
        List<Integer> sum = new ArrayList<>();
        for (int i = 1; i <= a[0]; i++) {
            for (int j = 1; j <= b[0]; j++) {
                sum.add(a[i] + b[j]);
            }
        }
        sum = sum.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < n; i++) {
            ans += sum.get(i);
        }
        System.out.println(ans);
    }
}
