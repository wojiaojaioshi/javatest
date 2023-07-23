public class 跳跃游戏 {
    public int jump(int[] nums) {
        int maxposion=0,step=0,end=0;
        for (int i = 0; i < nums.length-1; i++) {
            maxposion=Math.max(maxposion, i+nums[i]);
            if(i==end)
            {
                end=maxposion;
                step++;
            }
        }
        return step;
    }
}
