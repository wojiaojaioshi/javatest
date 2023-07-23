
import java.util.Scanner;

public class meituan20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext())
        {
            int n=sc.nextInt();
            int flat=0,sum=0;
            for (int i = 0; i <n; i++) {
                int temp=sc.nextInt();
                sum+=temp;
                if(temp==2)
                {
                    flat=1;
                    break;
                }
            }
            if(flat==1) System.out.println("NO");
            else if(flat==0&&sum-n==n-1) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
