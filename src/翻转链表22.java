public class 翻转链表22 {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            // 设置 dummyNode 是这一类问题的一般做法
            ListNode dummyNode = new ListNode(-1);
            dummyNode.next = head;
            ListNode pre = dummyNode;
            //移动到第left个节点
            for (int i = 0; i < left - 1; i++) {
                pre = pre.next;
            }
            ListNode cur = pre.next;
            ListNode next;
            for (int i = 0; i < right - left; i++) {
                next=cur.next;
                cur.next= next.next;
                next.next=pre.next;
                pre.next=next;
            }
            return dummyNode.next;
        }
}
