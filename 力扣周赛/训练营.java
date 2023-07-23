public class 训练营 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
    public static int balancedStringSplit(String s) {
        int len=s.length();
        if(len<=2)return 1;
        int Rsum=0,Lsum=0,res=0;
        for (int i = 0; i <len ; i++) {
            if(s.charAt(i)=='R')Rsum++;
            else Lsum++;
            if(Rsum==Lsum)
            {
                Rsum=0;
                Lsum=0;
                res++;
            }
        }
        return res;
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        ListNode pa=headA,pb=headB;
        while(pa!=pb)
        {
            pa=pa==null?headB:pa.next;
            pb=pb==null?headA:pb.next;
        }
        return pa;
    }
}
