package 字符串数组集合;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class 跳房子1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = Integer.parseInt(sc.nextLine());
        int[] steps = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(getResult(steps, goal));
    }

    public static String getResult(int[] steps, int goal) {
        int minStep = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        String ans = "";
        for (int idx1 = 0; idx1 < steps.length; idx1++) {
            int step1 = steps[idx1];
            int step2 = goal - step1;
            if (map.containsKey(step2)) {
                int idx2 = map.get(step2);
                if (idx1 + idx2 < minStep) {
                    minStep = idx1 + idx2;
                    ans = "[" + step1 + "," + step2 + "]";
                }
            } else {
                map.putIfAbsent(step1, idx1);
            }
        }
        return ans;
    }
}
