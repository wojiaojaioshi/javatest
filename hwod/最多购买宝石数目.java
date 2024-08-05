import java.util.Map;
import java.util.Scanner;

public class 最多购买宝石数目 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (n > 0) {
            int l = 0, r = 0, sum = nums[0], ans = 0;
            while (r < n) {
                if (sum < k) {
                    ans = Math.max(ans, r - l + 1);
                    r++;
                    if (r < n) {
                        sum += nums[r];
                    }
                } else if (sum > k) {
                    l++;
                    sum -= nums[l - 1];
                } else {
                    ans = Math.max(ans, r - l + 1);
                    l++;
                    sum -= nums[l - 1];
                }
            }
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
