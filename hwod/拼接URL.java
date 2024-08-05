import java.util.Scanner;

public class 拼接URL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getResult(str));
    }

    static String getResult(String str) {
        StringBuilder res = new StringBuilder();
        int pre = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') {
                while (i != 0 && res.charAt(res.length() - 1) == '/') {
                    res.deleteCharAt(res.length() - 1);
                }
                res.append('/');
                pre = 1;
                continue;
            }
            if (str.charAt(i) == '/') {
                if (pre == 0) {
                    res.append('/');
                } else {
                    if (str.charAt(i) == '/') {
                        continue;
                    }
                }
            } else {
                res.append(str.charAt(i));
                pre = 0;
            }
        }
        return res.toString();
    }
}
