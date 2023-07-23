import java.util.*;
public class meituan12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer>[]tree = new HashSet[n];
        for(int i=0;i<n;i++){
            tree[i] = new HashSet<>();
        }
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            tree[a].add(b);
            tree[b].add(a);
        }
        int[]r = new int[n];
        for(int i=0;i<n;i++){
            r[i] = sc.nextInt();
        }
        long ans = 0;
        for(int i=0;i<n;i++){
            boolean[]visited = new boolean[n];
            long a = dfs(tree,visited,i,r,k,r[i],i);
            ans  = (ans+a)%1000000007;
        }
        System.out.println(ans);
    }
    public static long dfs(Set<Integer>[]tree,boolean[]visited,int i,int[]r,int k,int k0,int i0){
        //当前已被访问
        visited[i] = true;
        long a = 1;
        //遍历i区域的邻接表（set）
        for(int j:tree[i]){
            //没有被访问过,职级要大于等于k0(i的职级)，并且不能大过k
            if(!visited[j]&&r[j]>=k0&&r[j]-k0<=k&&(r[j]>k0||j<i0))
                a = (a*(1+dfs(tree,visited,j,r,k,k0,i0)))%1000000007;
        }
        return a;
    }
}
