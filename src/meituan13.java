import java.util.Map;
import java.util.Scanner;

public class meituan13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        int m=sc.nextInt();
        float sum=0;
        for (int i = 0; i < m; i++) {
            sum+=n;
            n= (float) Math.sqrt(n);
        }
        System.out.printf("%.2f",sum);
    }
}
