import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NoA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=0;
        if(a<0||a>99||b<0||b>99) System.out.println(0);
        if(a<=9&&b<=9)
        {
            ans=11-a;
        }else
        {
            ans=(b+2)-a;
        }
        System.out.println(ans);
    }
}
