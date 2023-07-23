import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class meituan8{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        int [][]dp=new int[a+1][b+1];
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            for (int j = Math.min(a,i); j >=0 ; j--) {
                for (int k = Math.min(b,i-j); k >=0 ; k--) {
                    if(j==0&&k==0)continue;
                    if(k==0)
                        dp[j][k]=Math.max(dp[j][k],dp[j-1][k]+x);
                    else if(j==0)
                        dp[j][k]=Math.max(dp[j][k],dp[j][k-1]+y);
                    else dp[j][k]=Math.max(dp[j][k],Math.max(dp[j-1][k]+x,dp[j][k-1]+y));
                }
            }
        }
        System.out.println(dp[a][b]);
    }
}
