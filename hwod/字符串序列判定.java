import java.util.Scanner;

public class 字符串序列判定 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String l = sc.nextLine();
        int left = 0, right = 0, ans = 0;
        while (right < l.length()) {
            if (s.charAt(left) == l.charAt(right)) {
                ans = right;
                left++;
                right++;
            } else {
                right++;
            }
            if (left >= s.length()) break;
        }
        if (left == 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
