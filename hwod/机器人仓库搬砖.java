import java.util.Arrays;
import java.util.Scanner;

public class 机器人仓库搬砖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bricks = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = 0;
        if (bricks.length > 8) System.out.println(-1);
        else {
            int sum = Arrays.stream(bricks).sum();
            int minSpeed = sum / 8;
            int maxSpeed = Arrays.stream(bricks).max().orElse(0);
            for (int i = minSpeed; i <= maxSpeed; i++) {
                if (getResult(bricks, i)) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    static boolean getResult(int[] bricks, int speed) {
        int daySum = 0;
        for (int i = 0; i < bricks.length; i++) {
            if (bricks[i] % speed == 0) {
                daySum += bricks[i] / speed;
            } else {
                daySum += bricks[i] / speed + 1;
            }
        }
        if (daySum <= 8) return true;
        else return false;
    }
}
