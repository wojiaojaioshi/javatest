public class io {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            nums[i+1]^=nums[i];
        }
        return nums[nums.length-1];
    }
}
