import java.util.Arrays;
import java.util.Scanner;

public class 寻找身高相近的小朋友 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        Integer[] height = new Integer[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        Arrays.sort(height, (a, b) -> {
            int absA = Math.abs(a - k);
            int absB = Math.abs(b - k);
            if (absA != absB) return absA - absB;
            else return a - b;
        });
        for (Integer x:height) {
            System.out.print(x+" ");
        }
    }
}
