public class 使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length];
        dp[0]=cost[0];dp[1]=Math.min(cost[0],cost[1]);
        for (int i = 2; i <cost.length; i++) {
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
