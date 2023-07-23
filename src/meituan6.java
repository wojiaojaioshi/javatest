import java.util.*;

public class meituan6 {
    static Map<Integer,Integer>parent=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            parent.put(i,i);
        }
        for (int i = 0; i < n; i++) {
            int p= sc.nextInt();
            int q=sc.nextInt();
            if(p<q) union(p, q);
            else union(q,p);
        }

        Map<Integer,List<Integer>>res=new HashMap<>();
        Set<Integer>sum=new HashSet<>();
        for (int i = 1; i <=n; i++) {
            res.put(i, new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {
            int temp=find(i);
            sum.add(temp);
            res.get(temp).add(i);
        }
        List<Integer>sum2=new ArrayList<>(sum);
        System.out.println(sum.size());
        for (int i = 0; i < sum.size(); i++) {
            List<Integer>a=res.get(sum2.get(i));
            for (int j = 0; j < a.size(); j++) {
                System.out.print(a.get(j)+" ");
            }
            System.out.println();
        }

    }
    static void  union(int p,int q)
    {
        if(!parent.containsKey(p)||!parent.containsKey(q)) return;
        int parentp=find(p);
        int parentq=find(q);
        if(parentp==parentq)return;
        if(parentp<parentq)
        parent.put(parentp, parentq);
        else parent.put(parentq,parentp);
    }
    static int find(int x)
    {
        int root=x;
        while (parent.get(root)!=root)
        {
            root=parent.get(root);
        }
        while (parent.get(x)!=x)
        {
            x=parent.get(x);
            parent.put(x, root);
        }
        return root;
    }
}
