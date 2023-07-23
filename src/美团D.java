import java.util.Arrays;
import java.util.Scanner;

public class 美团D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a=new int[n+1];
        int []b=new int[m];
        for (int i = 0; i < m; i++) {
            int temp=sc.nextInt();
            b[i]=temp;
            a[temp]++;
        }
        a[b[0]]--;
        int sum=0,flat=1;
        for (int i = 1; i < b.length; i++) {
            if(b[i]!=flat)
            {
                a[b[i]]--;
                continue;
            }
            else
            {
                int temp=findnext(a, b[i]);
                flat=temp;
                sum++;
                a[b[i]]--;
            }
        }
        System.out.println(sum);
    }
    static int findnext(int []a,int x)
    {
        int minx=1,minv=a[1];
        for (int i = 1; i < a.length; i++) {
            if(a[i]<minv&&minx!=x)
            {
                minx=i;
                minv=a[i];
            }
        }
        return minx;
    }

}
