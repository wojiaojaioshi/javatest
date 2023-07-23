import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class 缺少的第一个正整数 {
//    public int firstMissingPositive(int[] nums) {
//        int len=nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]<=0)nums[i]=len+1;
//        }
//        for (int i = 0; i < len; i++) {
//            int num=nums[i];
//            if(num<=len){
//                nums[num-1]*=-Math.abs(nums[num-1]);
//            }
//        }
//        for (int i = 0; i < len; i++) {
//            if(nums[i]>0)return i+1;
//        }
//        return len+1;
//    }


    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i]>0&&nums[i]<=len&&nums[nums[i]-1]!=nums[i])
            {
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for (int i = 0; i < len; i++) {
            if(nums[i]!=i+1)return i+1;
        }
        return len+1;
    }


    public static void main(String[] args) {
        Comparator<Integer>comparator=(x,y)->Integer.compare(x, y);
        TreeSet<Integer>t=new TreeSet<>(comparator);
        t.add(9);
        t.add(1);
        t.stream().forEach(System.out::println);
    }
}
