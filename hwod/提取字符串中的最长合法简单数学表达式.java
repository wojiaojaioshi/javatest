import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2024年6月25日
public class 提取字符串中的最长合法简单数学表达式 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Pattern compile = Pattern.compile("(-?\\d+)([+*-])(\\d+)");

        int maxExpLen = 0;
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i <= maxExpLen) break;

            for (int j = i; j < s.length(); j++) {
                String subStr = s.substring(i, j + 1);
                Matcher m = compile.matcher(subStr);

                if (m.find() && subStr.length() > maxExpLen) {
                    maxExpLen = subStr.length();
                    System.out.println(maxExpLen+" "+m.groupCount()+" "+m.group(0).length());
                    long x = Long.parseLong(m.group(1));
                    long y = Long.parseLong(m.group(3));
                    String op = m.group(2);
                    switch (op) {
                        case "+":
                            ans = x + y;
                            break;
                        case "-":
                            ans = x - y;
                            break;
                        case "*":
                            ans = x * y;
                            break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
