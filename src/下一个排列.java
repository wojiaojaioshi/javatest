public class 下一个排列 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i>=0&&nums[i]>=nums[i+1])
        i--;
        //从后往前找到第一个前小于后的
        if(i>=0)
        {
            int j=nums.length-1;
            //从后往前找到第一个nums[i]小于后的
            while (j>=0&&nums[i]>=nums[j])j--;
            //交换得到的一定是刚好比这个数大的数
            swap(nums, i,j);
        }
        //i<0，即整个数是最大的，前大于后，它的下一个排列是翻转
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
