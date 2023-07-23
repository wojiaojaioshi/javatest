import java.util.Scanner;

public class meituan9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n+1];
        int []b=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i <=n ; i++) {
            int temp=sc.nextInt();
            a[temp]=0;
            b[i]=searchmaxv(a,temp);
        }
        for (int i = 1; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }
    static int searchmaxv(int []a,int x)
    {
        int maxv=0;
        int sum=0;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]!=0)
            {
                sum+=a[i];
            }
            else {
                sum=0;
            }
            maxv=Math.max(sum,maxv);
        }
        return maxv;
    }
}
