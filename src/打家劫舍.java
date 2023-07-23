public class 打家劫舍 {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length+1];
        int maxv=nums[0];
        dp[1]=nums[0];
        for (int i = 1; i <dp.length ; i++) {
            if(i-2>=0)
            {
                dp[i]=dp[i-2]+nums[i-1];
            }
            dp[i]=Math.max(dp[i],dp[i-1]);
        }
        return dp[nums.length];
    }
}
