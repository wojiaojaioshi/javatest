import java.util.Scanner;

public class 密码输入检测 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] inputStr = sc.nextLine().toCharArray();
        boolean flag = true;
        int big = 0, small = 0, number = 0, other = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputStr.length; i++) {
            if (inputStr[i] == '<') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(inputStr[i]);
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') small++;
            else if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') big++;
            else if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') number++;
            else other++;
        }
        if (sb.length() < 8 || small == 0 || big == 0 || number == 0 || other == 0) flag = false;
        System.out.println(sb + "," + flag);
    }
}
