import java.util.*;

public class 多段线数据压缩 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> ans = getResult(nums);
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> getResult(int[] nums) {

        int preX = nums[0];
        int preY = nums[1];
        float preK = 0;
        List<Integer> ans = new ArrayList<>();
        ans.add(preX);
        ans.add(preY);
        for (int i = 2; i < nums.length; i += 2) {
            float k = (float) (nums[i + 1] - preY) / (nums[i] - preX);
            if (i != 2) {
                if (k != preK) {
                    ans.add(preX);
                    ans.add(preY);
                }
                preX = nums[i];
                preY = nums[i + 1];
                preK = k;
            } else {
                preX = nums[i];
                preY = nums[i + 1];
                preK = k;
            }
            if (i == nums.length - 2) {
                ans.add(preX);
                ans.add(preY);
            }
        }
        return ans;
    }
}
