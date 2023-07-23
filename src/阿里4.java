import java.util.Scanner;

public class 阿里4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(),B=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        int rvalue=a/b;
        int maxv=0;int tempA=0,tempB=0;
        for (int i = A; i >=1 ; i--) {
            for (int j = B; j >=1 ; j--) {
                if(i/j>rvalue)break;
                if(i<j)break;
                int temp=i*j;
                if(i/j==rvalue&&temp>maxv&&i%j==0)
                {
                    tempA=i;
                    tempB=j;
                    maxv=temp;
                }
            }
        }
        System.out.println(tempA+" "+tempB);
    }
}
