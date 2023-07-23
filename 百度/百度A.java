
import java.util.Scanner;

public class 百度A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int maxv=0,temp;
        for (int i = 1; i <=k ; i++) {
            temp=i*n;
            int t=0;
            while (temp>0)
            {
                 t=t*10+temp%10;
                 temp/=10;
            }
            maxv=Math.max(maxv, t);
        }
        System.out.println(maxv);
    }
}
