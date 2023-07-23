//public class 删除链表的倒数第k {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            if(head==null)return head;
//            Object a;
//            a.equals()
//            if(head.next==null)return null;
//            ListNode temp=new ListNode(0,head);
//            ListNode fast=head,slow=temp;
//
//            for (int i = 0; i < n; i++) {
//                fast=fast.next;
//            }
//            while(fast!=null)
//            {
//                fast=fast.next;
//                slow=slow.next;
//            }
//            slow.next=slow.next.next;
//            //temp.next=temp.next.next;
//            return temp.next;
//        }
//}
