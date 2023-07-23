public class 在排序数组中查找数字 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{5,7,7,8,8,10}, 8));
    }
        public static int search(int[] nums, int target) {
            int l=0,r=nums.length-1,flat=0;
            while (l<r)
            {
                int m=l+(r-l)/2;
                if(nums[m]==target)
                {
                    flat=m;
                    break;
                }
                else if(nums[m]>target){
                    r=m-1;
                }else {
                    l=m+1;
                }
            }
            int sum=1;
            for (int i =flat+1 ; i <nums.length ; i++)
            {
                if(nums[i]==target)sum++;
                else break;
            }
            for (int i =flat-1 ; i >=0 ; i--)
            {
                if(nums[i]==target)sum++;
                else break;
            }
            return sum;
        }
}
