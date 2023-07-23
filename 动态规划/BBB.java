import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Arrays;
import java.util.Scanner;

public class BBB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []num=new int[n+1];
        int res=0;
        Arrays.fill(num, 0);
        int l=0;
        int r=0;
        int x=0;
        for (int i = 0; i < m; i++) {
             l=sc.nextInt();
             if(l<r)l=r;
             if(l>r&&i!=0){
                 for (int j = r+1; j <=l-1 ; j++) {
                     num[j]=1;
                 }
             }
             r=sc.nextInt();
             x=sc.nextInt();
            for(int j=l;j<=r&&x>0;j++)
            {
                if(num[j]==0)
                {
                    num[j]=1;
                    x--;
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(num[i]==1)res++;
        }
        System.out.println(res);
    }
}
