import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 最长子字符串的长度1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int oSum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                oSum++;
            }
        }
        if (oSum % 2 == 0) {
            System.out.println(str.length());
        } else {
            System.out.println(str.length() - 1);
        }

    }
}
