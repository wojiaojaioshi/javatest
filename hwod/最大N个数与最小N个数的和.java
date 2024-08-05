import java.util.*;
import java.util.stream.Collectors;

public class 最大N个数与最小N个数的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, flat = 0;
        List<Integer> nums = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input < 0 || input > 1000) {
                flat = 1;
            }
            if (!set.contains(input)) {
                set.add(input);
                nums.add(input);
            } else continue;
        }
        int k = sc.nextInt();
        if (k * 2 > nums.size() || flat == 1 || k <= 0) System.out.println(-1);
        else {
            Collections.sort(nums);

            for (int i = 1; i <= k; i++) {
                sum += nums.get(i - 1) + nums.get(nums.size() - i);
            }
            System.out.println(sum);
        }
    }
}
