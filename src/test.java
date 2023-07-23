import java.util.HashSet;
import java.util.Set;

public class test {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<Integer> set = new HashSet<>();
            ListNode temp = headA;
            while (temp != null) {
                set.add(temp.val);
                temp = temp.next;
            }
            temp = headB;
            while (temp != null) {
                if (set.contains(temp.val)) return temp;
                temp = temp.next;
            }
            return null;
        }
    }
}
