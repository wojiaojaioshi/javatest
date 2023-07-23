public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode q=head,p=head.next,temp=null;
        while (q.next!=null)
        {
            q.next=temp;
            temp=q;
            q=p;
            p=p.next;
        }
        q.next=temp;
        return q;
    }
}
