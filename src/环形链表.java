public class 环形链表 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head.next,slow=head;
        if(head==null)return null;
        while (fast!=slow)
        {
            if(fast==null)return null;
            fast=fast.next.next;
            slow=slow.next;
        }
        return fast;

    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
