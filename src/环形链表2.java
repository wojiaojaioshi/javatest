public class 环形链表2 {
    public ListNode detectCycle(ListNode head) {

        ListNode fast=head,slow=head,temp=head;
        while (fast!=null)
        {

            if(fast.next==null)return null;
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                ListNode ptr=head;
                while(ptr!=slow)
                {
                    ptr=ptr.next;
                    slow=slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
