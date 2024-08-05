import java.util.Arrays;
import java.util.Scanner;

public class 贪吃的猴子 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(getResult(len, nums, n));
    }

    public static int getResult(int len, int[] nums, int n) {
        if (nums.length <= n) return Arrays.stream(nums).sum();
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            int l = i, r = n - l;
            int sum = 0;
            for (int j = 0; j < l; j++) {
                sum += nums[j];
            }
            for (int j = len - 1; j > len - 1 - r; j--) {
                sum += nums[j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
