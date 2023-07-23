import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []a=new int[6];
        for (int i = 0; i < 6; i++) {
            a[i]=scanner.nextInt();
        }
        System.out.println(threeSum(a));
    }

        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            //排序
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]+" ");
            }
            //双指针,L为i+1是i后一个,R为len-1是数组最后一个
            int len = nums.length;
            for (int i = 0; i < len; ++i) {
                if (nums[i] > 0) return lists;//i对应的是3个下标中最小的

                if (i > 0 && nums[i] == nums[i - 1]) continue;
                //避免重复，在i的值相同的情况下有可能L+R相同
                int curr = nums[i];
                int L = i + 1, R = len - 1;
                while (L < R) {
                    int tmp = curr + nums[L] + nums[R];
                    if (tmp == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(curr);
                        list.add(nums[L]);
                        list.add(nums[R]);
                        lists.add(list);
                        while (L < R && nums[L + 1] == nums[L]) ++L;//循环结束后还要再移动一次，跳过重复的
                        while (L < R && nums[R - 1] == nums[R]) --R;
                        ++L;
                        --R;
                    } else if (tmp < 0) {
                        ++L;
                    } else {
                        --R;
                    }
                }
            }
            return lists;
        }

}
