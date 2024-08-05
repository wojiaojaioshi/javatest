import java.util.Arrays;
import java.util.Scanner;

public class 攀登者1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i - 1 < 0 || nums[i - 1] < nums[i]) && (i + 1 >= nums.length || nums[i + 1] < nums[i])) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
