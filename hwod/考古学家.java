import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class 考古学家 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        List<String> ans = new ArrayList<>();

        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        dfs(str, ans, vis, 0, new StringBuilder());
        ans = ans.stream().distinct().collect(Collectors.toList());
        ans.stream().sorted().forEach(System.out::println);
    }

    static void dfs(String[] str, List<String> ans, boolean[] vis, int index, StringBuilder cur) {
        if (index == str.length) {
            ans.add(cur.toString());
            return;
        }
        for (int i = 0; i < str.length; i++) {
            if (!vis[i]) {
                vis[i] = true;
                dfs(str, ans, vis, index + 1, cur.append(str[i]));
                vis[i] = false;
                int len = str[i].length();
                for (int j = 0; j < len; j++) {
                    cur.deleteCharAt(cur.length() - 1);
                }
            }
        }
    }
}
