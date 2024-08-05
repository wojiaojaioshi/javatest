package 正则匹配;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 火星文计算2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getResult(str));
    }

    static long getResult(String str) {
        Pattern pattern = Pattern.compile("(\\d+)(#)(\\d+)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String subStr = matcher.group(0);
            long x = Long.parseLong(matcher.group(1));
            long y = Long.parseLong(matcher.group(3));
            str = str.replaceFirst(subStr, String.valueOf(4 * x + 3 * y + 2));
            matcher = pattern.matcher(str);
        }
        Pattern pattern2 = Pattern.compile("(\\d+)(\\$)(\\d+)");
        Matcher matcher2 = pattern2.matcher(str);
        while (matcher2.find()) {
            String subStr = matcher2.group(0);
            long x = Long.parseLong(matcher2.group(1));
            long y = Long.parseLong(matcher2.group(3));
            str = str.replace(subStr, String.valueOf(2 * x + y + 3));
            matcher2 = pattern2.matcher(str);
        }
        return Long.parseLong(str);
    }
}
