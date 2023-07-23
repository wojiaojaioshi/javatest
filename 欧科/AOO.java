import java.util.List;

public class AOO {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if(head==null)return head;
        ListNode ans=new ListNode(0);
        ans.next=head;
        ListNode slow=ans;
        ListNode fast=ans;
        for (int i = 0; i <n; i++) {
            fast=fast.next;
        }
        while (fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return ans.next;
    }
}
