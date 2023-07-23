public class qq {
    public int search(int[] nums, int target) {
       return bysearch(0, nums.length-1, target, nums);
    }
    int bysearch(int l,int r,int target,int nums[])
    {
        if(l<=r)
        {
            int m=(l+r)>>1;
            if(nums[m]==target)return m;
            if(nums[m]<target)bysearch(m+1, r, target, nums);
            if(nums[m]>target)bysearch(l, m, target, nums);
        }
        return -1;
    }
}
