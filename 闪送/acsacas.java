
import java.util.Scanner;

class LNode{
    public LNode(int val, int  left, int rigth) {
        this.val = val;
        this.left = left;
        this.rigth = rigth;
    }

    int val;
    int left;
    int  rigth;
}
public class acsacas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int root=sc.nextInt();
        LNode []arr=new LNode[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=new LNode(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        pre(root, arr);
        System.out.println();
        in(root,arr);
        System.out.println();
        out(root, arr);
    }
    static void pre(int node,LNode arr[]){
        if(node==0)return;
        System.out.print(arr[node].val+" ");
        pre(arr[node].left,arr);
        pre(arr[node].rigth,arr);
    }
    static void in(int node,LNode arr[]){
        if(node==0)return;

        in(arr[node].left,arr);
        System.out.print(arr[node].val+" ");
        in(arr[node].rigth,arr);
    }
    static void out(int node,LNode arr[]){
        if(node==0)return;

        out(arr[node].left,arr);
        out(arr[node].rigth,arr);
        System.out.print(arr[node].val+" ");
    }
}
