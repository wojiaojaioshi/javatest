public class 完全平方数 {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        for (int i = 1; i <dp.length ; i++) {
            int minn=Integer.MAX_VALUE;
            for (int j = 1; j*j <=i ; j++) {
                minn=Math.min(minn,dp[i-j*j]);
            }
            dp[i]=minn+1;
        }
        return dp[n];
    }
}
