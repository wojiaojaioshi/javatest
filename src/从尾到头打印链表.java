import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 从尾到头打印链表 {
    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode p=null,t=head,next;
            List<Integer>list=new ArrayList<>();
            while (t!=null)
            {
                next=t.next;
                t.next=p;
                p=t;
                t=next;
            }
            while (p!=null)
            {
                list.add(p.val);
                p=p.next;
            }
            int []res=new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i]=list.get(i);
            }
            return res;
        }
    }
}
