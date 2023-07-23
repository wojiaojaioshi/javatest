import java.util.Scanner;

public class meituan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=0,y=0;
        int sum=0,sumy=0;
        while (n-->0)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            if(x<y)
            {
                sum+=y;
            }
            else
            {
                sum+=x;
            }
            sumy+=y;
        }
        System.out.print(sum+" "+(sum-sumy));

    }
}
