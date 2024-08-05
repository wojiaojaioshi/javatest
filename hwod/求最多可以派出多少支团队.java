import java.util.Arrays;
import java.util.Scanner;

public class 求最多可以派出多少支团队 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] ability = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(sc.nextLine());
        System.out.println(getResult(n, ability, k));
    }

    static int getResult(int n, int[] ability, int k) {
        int l = 0, r = n - 1, ans = 0;
        Arrays.sort(ability);
        while (l <= r && ability[r] >= k) {
            ans++;
            r--;
        }
        while (l < r) {
            if (ability[l] + ability[r] >= k) {
                l++;
                r--;
                ans++;
            } else {
                l++;
            }
        }
        return ans;
    }
}
