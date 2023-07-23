
import java.util.Scanner;

public class NoEE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
     int a[] =new int[n];
     int b[] =new int[n];
     int c[] =new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i]=sc.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(!(a[i]<b[j])&&(2*a[i]>=b[j]))continue;
                for (int k = 0; k <n ; k++) {
                    int x=a[i];
                    int y=b[j];
                    int z=c[k];
                    if((x<y)&&(2*x>=y)&&(y<z)&&(2*y>=z))
                    {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }

}

