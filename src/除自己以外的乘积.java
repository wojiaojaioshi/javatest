public class 除自己以外的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int sum=1,falt=0;
        for (int x:nums) {
            if(x!=0)
            {
                sum*=x;
            }
            else falt=1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(falt==1)
            {
                if(nums[i]!=0)
                {
                    nums[i]=0;
                }
                else nums[i]=sum/nums[i];
            }
            else
            {
                nums[i]=sum/nums[i];
            }
        }
        return nums;
    }
}
