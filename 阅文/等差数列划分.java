public class 等差数列划分 {
    class Solution {
        public int numberOfArithmeticSlices(int[] nums) {
            if(nums.length<3)return 0;
            int d=nums[0]-nums[1],L=2,ans=0;
            for (int i = 2; i <nums.length ; i++) {
                if(nums[i-1]-nums[i]==d)
                {
                    L++;
                }else {
                    ans+=(L-1)*(L-2)/2;
                    L=0;
                    d=nums[i-1]-nums[i];
                }
            }
            return ans;
        }
    }
}
