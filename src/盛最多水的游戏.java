public class 盛最多水的游戏 {
    public static void main(String[] args) {
        int []nums={0,1,1};
        System.out.println(maxArea(nums));
    }
        public static int maxArea(int[] height) {
            int l = 0, r = height.length - 1;
            int ans = 0;
            while (l < r) {
                int area = Math.min(height[l], height[r]) * (r - l);
                ans = Math.max(ans, area);
                if (height[l] <= height[r]) {
                    ++l;
                }
                else {
                    --r;
                }
            }
            return ans;
        }
}
