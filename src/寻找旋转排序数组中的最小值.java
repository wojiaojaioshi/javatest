import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int x:nums) {
            list.add(x);
        }
        int minv=Integer.MAX_VALUE;
        while (minv>list.get(0))
        {
            minv=list.get(0);
            int t=list.get(0);
            list.remove(0);
            list.add(t);

        }
        return list.get(0);
    }
}
