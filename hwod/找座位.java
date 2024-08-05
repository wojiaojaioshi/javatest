import java.util.Scanner;

public class 找座位 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();

        int ans = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '1') {
                continue;
            } else {
                if ((i - 1 < 0 || str[i - 1] == '0') && (i + 1 >= str.length || str[i + 1] == '0')) {
                    str[i] = '1';
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
