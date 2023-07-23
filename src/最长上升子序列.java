public class 最长上升子序列 {
        public int lengthOfLIS(int[] nums) {
            int len=nums.length;
            if(len==0)return 0;
            int []dp=new int[len];int maxv=0;
            dp[0]=1;
            for (int i = 1; i < len; i++) {
                dp[i]=1;
                for (int j = 0; j < i; j++) {
                    if(nums[i]>nums[j])
                    {
                        dp[i]=Math.max(dp[i],dp[j]+1);
                    }
                    maxv=Math.max(maxv,dp[i]);
                }
            }
            return maxv;
        }
}
