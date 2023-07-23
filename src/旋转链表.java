public class 旋转链表 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        if(head.next==null)return head;
        int len=1;ListNode p=head;
        while (p.next!=null)
        {
            p=p.next;
            len++;
        }
        k%=len;
        for (int i = 0; i < k; i++) {
            ListNode p1=head;
            while (p1.next.next!=null)
            {
                p1=p1.next;
            }
            p1.next.next=head;
            head=p1.next;
            p1.next=null;
        }
        return head;
    }
}
