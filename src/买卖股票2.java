public class 买卖股票2 {
    public static void main(String[] args) {
        int sum=maxProfit2(new int[]{7,1,5,3,6,4});
        System.out.println(sum);
    }
    public static int maxProfit2(int[] prices) {
        int n=prices.length;
        int [][]dp=new int[n][2];
        dp[0][0]=0;dp[0][1]=0;
        for (int i = 0; i < n; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[n-1][0];
    }
}
