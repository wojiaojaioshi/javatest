import java.util.Scanner;

public class meituan18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char [] s=str.toCharArray();
        int num1=0,num2=0;
        for (int i = 0; i < s.length; i++) {
            if(s[i]>'a'&&s[i]<'z')num1++;
            else num2++;
        }
        System.out.println(Math.abs(num1-num2)/2);
    }
}
