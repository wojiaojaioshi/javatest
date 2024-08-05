import java.math.BigInteger;
import java.util.Scanner;

public class 抢7游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] dpA = new int[m + 2];
        int[] dpB = new int[m + 2];
        dpA[m] = 1;
        for (int i = m - 1; i >= 7; i--) {
            dpB[i] = dpA[i + 1] + dpA[i + 2];
            dpA[i] = dpB[i + 1] + dpB[i + 2];
        }
        System.out.println(dpB[7]);
    }
}
