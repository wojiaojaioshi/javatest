import sun.awt.util.IdentityLinkedList;

import java.util.ArrayList;
import java.util.List;

public class 格雷编码2 {
//    public List<Integer> grayCode(int n) {
//
//        List<Integer> list=new ArrayList<>();list.add(0);
//        int head=1;
//        for (int i = 0; i < n; i++) {
//            for (int j =list.size()-1; j >=0 ; j--) {
//                list.add(head+list.get(j));
//            }
//            head=head<<1;
//        }
//        return list;
//    }
    List<Integer> res = new ArrayList<>();
    public List<Integer> grayCode(int n) {
        backtrace(n,new StringBuffer(),new int[]{0,1});
        return res;
    }
    public void backtrace(int n, StringBuffer sb, int[] nums){
        //判断条件，是否返回
        if(sb.length() == n){
            // 二进制转换为十进制
            res.add(Integer.valueOf(sb.toString(),2));
            return;
        }
        // 回溯第一个状态
        sb.append(nums[0]);
        //注意数组
        backtrace(n,sb,new int[]{0,1});
        sb.deleteCharAt(sb.length()-1);
        // 回溯第二个状态
        sb.append(nums[1]);
        //注意数组
        backtrace(n,sb,new int[]{1,0});
        sb.deleteCharAt(sb.length()-1);
    }
}
