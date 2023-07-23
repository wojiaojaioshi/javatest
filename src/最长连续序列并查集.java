import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

public class 最长连续序列并查集 {
    Map<Integer,Integer>parent=new HashMap<>();
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer>parent=new HashMap<>();
        for (int x :nums) {
            parent.put(x, x);
        }
        for (int x:nums) {
            union(x,x+1);
        }
        int maxv=0;
        for (int x:nums) {
            maxv=Math.max(maxv, find(x)-x+1);
        }
        return maxv;
    }
    void union(int p,int q)
    {
        if(!parent.containsKey(p)|| !parent.containsKey(q))return;
        int parentp=find(p);
        int parentq=find(q);
        if(parentp==parentq)return;
        parent.put(p,q);
    }
    int find(int x)
    {
        int root=x;
        while (parent.get(root)!=root)
        {
            root=parent.get(root);
        }
        while (parent.get(x)!=x)
        {
            x=parent.get(x);
            parent.put(x,root);
        }
        return root;
    }

}


