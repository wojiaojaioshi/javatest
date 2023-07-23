import java.util.Scanner;

public class A360 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), sum=0;
        while (n-->0)
        {
            int flag=0;
            String str=sc.next();
            char a[]=str.toCharArray();
            if(a.length>10)continue;
            for (int i = 0; i < a.length; i++) {
                if(!(a[i]>='a'&&a[i]<='z')&&!(a[i]>='A'&&a[i]<='Z'))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            sum++;
        }
        System.out.println(sum);
    }
}
