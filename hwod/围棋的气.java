import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 围棋的气 {
    static int[][] offsets = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] black = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] white = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> bGas = new HashSet<>();
        Set<Integer> wGas = new HashSet<>();
        int blackGas = 0, whiteGas = 0;
        for (int i = 0; i < black.length; i += 2) {
            bGas.add(black[i] * black.length + black[i + 1]);
            bGas.add(white[i] * black.length + white[i + 1]);
            wGas.add(black[i] * black.length + black[i + 1]);
            wGas.add(white[i] * black.length + white[i + 1]);
        }

        for (int i = 0; i < black.length; i += 2) {
            for (int j = 0; j < 4; j++) {
                int gasX = black[i] + offsets[j][0];
                int gasY = black[i + 1] + offsets[j][1];
                if (bGas.contains(gasX * black.length + gasY)) continue;
                else {
                    if (gasX >= 0 && gasX < 19 && gasY >= 0 && gasY <= 19) {
                        blackGas++;
                        bGas.add(gasX * black.length + gasY);
                    }
                }
            }
        }
        for (int i = 0; i < white.length; i += 2) {
            for (int j = 0; j < 4; j++) {
                int gasX = white[i] + offsets[j][0];
                int gasY = white[i + 1] + offsets[j][1];
                if (wGas.contains(gasX * white.length + gasY)) continue;
                else {
                    if (gasX >= 0 && gasX < 19 && gasY >= 0 && gasY <= 19) {
                        whiteGas++;
                        wGas.add(gasX * white.length + gasY);
                    }
                }
            }
        }
        System.out.println(blackGas + " " + whiteGas);
    }
}
