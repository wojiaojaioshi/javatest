package 回溯;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 字符串拼接 {

    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String str = input[0];
        int n = Integer.parseInt(input[1]);
        boolean inputCheck = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                inputCheck = false;
            }
        }
        if (inputCheck) {
            dfs(str, 0, n, new boolean[str.length()], ' ', 0, new StringBuilder());
            System.out.println(set.size());
        } else {
            System.out.println(0);
        }
    }

    static void dfs(String str, int index, int n, boolean[] uesd, char pre, int ans, StringBuilder path) {
        if (index == n) {
            set.add(path.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (uesd[i]) continue;
            if (str.charAt(i) == pre) continue;
            uesd[i] = true;
            path.append(str.charAt(i));
            dfs(str, index + 1, n, uesd, str.charAt(i), ans, path);
            path.deleteCharAt(path.length() - 1);
            uesd[i] = false;
        }
    }
}
