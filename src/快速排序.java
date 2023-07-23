public class 快速排序 {
    public static void main(String[] args) {
        int[]nums={4,5,61,12,234,14,123,};
        quicksort(nums, 0, nums.length-1);
        for (int x:nums) {
            System.out.print(x+" ");
        }
    }

    static void quicksort(int[]nums,int l,int r)
    {
        if(l>=r)return;
        int i=l,j=r,pivot=nums[l];

        while(i!=j)
        {
            while (i<j&&nums[j]>=pivot)j--;
            if(i<j)nums[i++]=nums[j];
            while (i<j&&nums[i]<=pivot)i++;
            if(i<j)nums[j--]=nums[i];
        }
        nums[i]=pivot;
        quicksort(nums, l,i-1 );
        quicksort(nums, j+1, r);
    }

}

