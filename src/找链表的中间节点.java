public class 找链表的中间节点 {
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return null;
        ListNode fast=head,low=head;
        while (fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            low=low.next;
        }
        if(fast.next==null)
        return low;
        else
            return low.next;
    }
}
