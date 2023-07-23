import java.util.*;

public class meituan15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        Set<Integer>[] tree=new Set[n+1];
        for (int i = 1; i <= n; i++) {
            tree[i]=new HashSet<>();
        }
        for (int i = 0; i <n-1 ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            tree[a].add(b);
            tree[b].add(a);
        }
        int []disx=new int[n+1];
        int []disy=new int[n+1];
        getDiStance(disx,tree,x);
        getDiStance(disy,tree,y);
        int maxTime=Integer.MIN_VALUE;
        for (int i = 1; i <=n; i++) {
            if(disx[i]>disy[i])
                maxTime=Math.max(maxTime,disx[i]);
        }
        System.out.println(maxTime);
    }
    static void getDiStance(int[] dis,Set<Integer>[] tree,int start)
    {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(start);
        boolean[] visited=new boolean[dis.length];
        visited[start]=true;
        while (!queue.isEmpty())
        {
            int curNode=queue.poll();
            for (int nextNode:tree[curNode]) {
                if(!visited[nextNode])
                {
                    dis[nextNode]=dis[curNode]+1;
                    queue.add(nextNode);
                    visited[nextNode]=true;
                }
            }
        }

    }
}
