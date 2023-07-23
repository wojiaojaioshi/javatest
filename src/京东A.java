import java.util.Scanner;

public class 京东A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        String str=sc.next();
        char []ps=str.toCharArray();
        for (int i = 0; i < n; i++) {
            if(ps[i]=='L')
            {
                x=2*x;
            }
            else if(ps[i]=='R')
            {
                x=2*x+1;
            }else if(ps[i]=='U')
            {
                x=x/2;
            }
        }
        long ans= (long) (x%Math.pow(10, 18));
        System.out.println(ans);
    }
}
