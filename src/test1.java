public class test1 {


    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int a=new Solution().massage(nums);
        System.out.println(a);
    }
}
class Solution {
    public int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int dp0 = 0, dp1 = nums[0];

        for (int i = 1; i < n; i++) {
            int ndp0 = Math.max(dp0, dp1);
            int ndp1 = dp0 + nums[i];
            dp0 = ndp0;
            dp1 = ndp1;
        }
        return Math.max(dp0, dp1);
    }
}