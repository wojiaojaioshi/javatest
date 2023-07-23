public class 调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1,temp=0;
        while (i<j)
        {
            while (i<j&&(nums[i]&1)==1)i++;
            while (i<j&&(nums[j]&1)==0)j--;
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
}
