import java.util.Arrays;
import java.util.Scanner;

public class 灰度图存储 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] find = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target;
        if (find[0] == 0) {
            target = find[1];
        } else {
            target = (find[0]) * num[1] + (find[1] + 1);
        }
        int cur = 0;
        for (int i = 2; i < num.length; i += 2) {
            cur += num[i + 1];
            if (target <= cur) {
                System.out.println(num[i]);
                break;
            }
        }
    }
}
