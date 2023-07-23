import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.stream.Stream;

public class No56 {
    public static void main(String[] args) {
        int ans[]={4,1,6,4};
        int[]res=singleNumbers(ans);
        System.out.println(res[0]+" "+res[1]);
    }
        public static int[] singleNumbers(int[] nums) {
            int ret = 0;
            for (int n : nums) {
                ret ^= n;
            }
            int div = 1;
            //找到ret中第一个二进制为1的位置
            while ((div & ret) == 0) {
                div <<= 1;
            }
            int a = 0, b = 0;
            for (int n : nums) {
                //按照第一个为一的位置去分类，为1的一边，为0的一边，同样的会被异或掉
                if ((div & n) ==1) {
                    a ^= n;
                } else {
                    b ^= n;
                }
            }
            return new int[]{a, b};
        }
}
