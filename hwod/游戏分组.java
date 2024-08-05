import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 游戏分组 {
    static int ans = Integer.MAX_VALUE, sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sum = Arrays.stream(arr).sum();
        dfs(0, arr, new ArrayList<>());
        System.out.println(ans);
    }

    static void dfs(int index, int[] arr, List<Integer> list) {
        if (index == 5) {
            int lsum = list.stream().mapToInt(Integer::intValue).sum();
            int rsum = sum - lsum;
            ans = Math.min(ans, Math.abs(lsum - rsum));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
                dfs(index + 1, arr, list);
                list.remove(list.size() - 1);
            } else {
                continue;
            }
        }
    }

}
