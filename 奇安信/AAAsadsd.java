import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Map;
import java.util.Scanner;

public class AAAsadsd {
    public static void main(String[] args) {
        int [][]polints={{0,1},{0,2},{0,3}};
        System.out.println(getMinLen(polints));
    }
    public static int getMinLen (int[][] points) {
        int dp[][]=new int[101][101];
        int n=points.length;
        int maxv=0;
        for (int i = 0; i < n; i++) {
                int x=points[i][0];
                int y=points[i][1];
                dp[x][y]=1;

        }
        for (int i = 1; i < 101; i++)
        {
            dp[i][0]=dp[i-1][0]+dp[i][0];
            maxv=Math.max(dp[i][0],maxv);
        }
        for (int i = 1; i < 101; i++)
        {
            dp[0][i]=dp[0][i-1]+dp[0][i];
            maxv=Math.max(dp[0][i],maxv);
        }
        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if(dp[i][j]>0)
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+dp[i][j];
                dp[i][j]=0;
                maxv=Math.max(dp[i][j],maxv);
            }
        }
         return maxv;
    }
}
