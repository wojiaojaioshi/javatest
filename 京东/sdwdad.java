import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class sdwdad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int maxv=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            maxv=Math.max(maxv, a[i]);
        }
        for (int i = 0; i < n; i++) {
            if(a[i]<maxv)sum++;
        }
        System.out.println(sum);
    }
}
