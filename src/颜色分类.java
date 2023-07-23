public class 颜色分类 {
    public void sortColors(int[] nums) {
        int p=0,q=nums.length-1;
        for (int i = 0; i <=q ; i++) {
            if(nums[i]==2&&i<=q)
            {
                int temp=nums[q];
                nums[q]=nums[i];
                nums[i]=temp;
                q--;
            }
            if(nums[i]==0)
            {
                int temp=nums[p];
                nums[p]=nums[i];
                nums[i]=temp;
                p++;
            }
        }
    }
}
