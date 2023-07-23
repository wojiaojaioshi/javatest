import java.util.Random;

public class 求解第k大的元素 {
    public int findKthLargest(int[] nums, int k) {
            int target=nums.length-k;
            int l=0,r=nums.length-1;
            while(true) {
                int index = partion(l, r, nums);
                if (index == target) {
                    return nums[l];
                }else if(index<target)l=index+1;
                else r=index-1;
            }
    }//[3,2,1,4,5,6]  2
    int partion(int l,int r,int[] nums)
    {
        int j=l,p=nums[l];
        for (int i = l+1; i <=r ; i++) {
            if(p>nums[i])
            {
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, l, j);
        return j;
    }
    void swap(int []nums,int x1,int x2)
    {
        int t=nums[x1];
        nums[x1]=nums[x2];
        nums[x2]=t;
    }
}
