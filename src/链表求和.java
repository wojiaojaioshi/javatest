public class 链表求和 {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head=new ListNode(0),node=head;
            int carry=0;
            while (l1!=null||l2!=null)
            {
                int sum=carry;
                if(l1!=null)
                {
                    sum+=l1.val;
                    l1=l1.next;
                }
                if(l2!=null)
                {
                    sum+=l2.val;
                    l2=l2.next;
                }
                carry=sum/10;
                ListNode temp=new ListNode(sum%10);
                node.next=temp;
                node=node.next;
            }
            if(carry!=0)
            {
                ListNode temp=new ListNode(carry);
                node.next=temp;
                node=node.next;
            }
            return head.next;
        }
}
