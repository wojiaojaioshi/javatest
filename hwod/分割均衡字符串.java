import java.util.Scanner;

public class 分割均衡字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countX = 0, countY = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') countX++;
            else if (str.charAt(i) == 'Y') countY++;
            if (countX == countY) ans++;
        }
        System.out.println(ans);
    }
}
