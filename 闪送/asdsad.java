import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asdsad {

    public static void main(String[] args) {
        String []s=new String[10];
        System.out.println(s.length);
//        Scanner sc=new Scanner(System.in);
//        String in=sc.next();
//        List<Integer>list=new ArrayList<>();
//        for (String x:in.split(" ")) {
//            list.add(Integer.valueOf(x));
//            System.out.println(Integer.valueOf(x));
//        }
//        LiNode head= create(list);
//        LiNode tail=fun(head);
//        print(tail);

    }
    static  LiNode fun(LiNode head)
    {
        LiNode q=null,p=head,n=head.next;
        while (p.next!=null)
        {
            p.next=q;
            q=p;
            p=n;
            n=n.next;
        }
        p.next=q;
        return p;
    }
    static LiNode create(List<Integer>list)
    {
        LiNode head=new LiNode(list.get(0));
        LiNode p=head;
        for (int i = 1; i < list.size(); i++) {
            LiNode node=new LiNode(list.get(i));
            p.next=node;
            p=p.next;
        }
        return head;
    }
    static void  print(LiNode head)
    {
        LiNode p=head;
        while (p!=null)
        {
            System.out.println(p.val);
            p=p.next;
        }
    }
}
class LiNode{
    public LiNode (int x)
    {
        this.val=x;
    }
    int val;
    LiNode next;
}
class bird{
    int x,y;
void fly(int x,int y)
{
    this.x=x; this.y=y;
}
}
