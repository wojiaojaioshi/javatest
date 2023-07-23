import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class 翻转链表2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<ListNode> stack = new Stack<>();
        int n = 0;
        ListNode l = head;
        ListNode rh = null;
        while (l != null){
            n++;
            if (n == right){
                ListNode t = l;
                ListNode nx = l.next;
                rh = t;
                for (int i = 0; i < right - left; i++){
                    t.next = stack.pop();
                    t = t.next;
                }
                t.next = nx;
                if (!stack.isEmpty())
                    stack.pop().next = rh;
                break;
            }
            stack.push(l);
            l = l.next;
        }

        return left == 1 ? rh : head;
    }
}
