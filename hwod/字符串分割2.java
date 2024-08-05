import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class 字符串分割2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split("-");
        List<String> ans = new ArrayList<>();
        StringBuilder arr2 = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            arr2.append(arr[i]);
        }
        ans.add(arr[0]);
        for (int i = 0; i < arr2.length(); i += k) {
            String temp;
            if (i + k < arr2.length()) {
                temp = arr2.substring(i, i + k);
            } else {
                temp = arr2.substring(i);
            }
            ans.add(changeString(temp));
        }
        StringJoiner sj = new StringJoiner("-");
        for (int i = 0; i < ans.size(); i++) {
            sj.add(ans.get(i));
        }
        System.out.println(sj);
    }

    static String changeString(String str) {
        int min = 0, max = 0;
        String res;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                min++;
            } else if (Character.isUpperCase(c)) {
                max++;
            }
        }
        if (min > max) {
            res = str.toLowerCase();
        } else if (max > min) {
            res = str.toUpperCase();
        } else {
            res = str;
        }
        return res;
    }

}
