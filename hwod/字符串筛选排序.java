import java.util.Arrays;
import java.util.Scanner;

public class 字符串筛选排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getResult(sc.nextLine(), sc.nextInt()));

    }

    static int getResult(String str, int k) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        if (k > chars.length) k = chars.length;
        char tar = chars[k - 1];
        return str.indexOf(tar);
    }
}
