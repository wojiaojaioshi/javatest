import java.util.Scanner;

public class meituan1 {
    public static void main(String[] args) {
        float sum=0,temp=0,res=0;
        Scanner scanner=new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            temp=scanner.nextInt();
            sum+=i*temp;
            res+=temp;
        }
        float sum1=sum/res*10;
        sum1=(int)sum1;
        System.out.println(sum1/10);

    }
}
