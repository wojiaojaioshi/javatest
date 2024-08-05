package 回溯;

import java.util.Arrays;
import java.util.Scanner;

public class 田忌赛马 {
    static int[] a;
    static int[] b;
    static int maxCount = 0;
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        dfs(0, new boolean[a.length], 0);
        System.out.println(ans);
    }

    static void dfs(int x, boolean[] used, int biggerCount) {
        if (x == a.length) {
            if (biggerCount > maxCount) {
                ans = 1;
                maxCount = biggerCount;
            } else if (biggerCount == maxCount) {
                ans++;
            }
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (used[i]) continue;
            if (i > 0 && a[i] == a[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            dfs(x + 1, used, biggerCount + (a[i] > b[x] ? 1 : 0));
            used[i] = false;
        }
    }
}
