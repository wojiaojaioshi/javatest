import java.util.Arrays;
import java.util.Scanner;

public class 游戏分组2 {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1, lsum = 0, rsum = 0;
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                lsum += arr[l];
                rsum += arr[r];
            } else {
                lsum += arr[l++] + arr[r--];
                rsum += arr[l++] + arr[r--];
            }
        }
        ans = Math.abs(lsum - rsum);
        System.out.println(ans);
    }
}
