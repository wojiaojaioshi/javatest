import java.util.Scanner;

public class 翻转单词顺序 {
    public static void main(String[] args) {
        String str="   hello world!  ";
        String s[]=str.trim().split(" ");
        for (String x:s) {
            System.out.print(x+" ");
        }
    }
}
