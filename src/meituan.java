
import java.util.*;

/**
 * @author Jiang锋时刻
 * @create 2021-08-09 15:54
 */
public class meituan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            uf.union(v1, v2);
        }
        System.out.println(uf.size());
        /**
         * 之前使用的是HashMap, 会出现乱序的情况
         */
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for (int i = 0; i <= n; i++) {
            int v = uf.parent[i];
            if (map.get(v) == null) {
                map.put(v, new ArrayList<>());
            }
            map.get(v).add(i);
        }

        for (int key: map.keySet()) {
            if (key == 0) {
                continue;
            }
            int size = map.get(key).size();
            for (int j = 0; j < size; j++) {

                System.out.print(map.get(key).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class UnionFind {
    public int[] parent;
    public int count;
    public UnionFind(int n) {
        count = n;
        parent = new int[n + 1];
        for(int i = 1; i <= n; i++){
            parent[i] = i;
        }
    }

    public int find(int x) {
        while(parent[x] != x){
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    /**
     * 之前只进行的合并, 并没有想到将大的编号放在小的编号下面
     * @param x
     * @param y
     */
    public void union(int x, int y) {
        if(x == y) return;
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY) return;
        // 将节点编号大的合并到节点编号小的节点下面
        if(rootX < rootY){
            for(int i = 0; i < parent.length; ++i){
                if(parent[i] == rootY)
                    parent[i] = rootX;
            }
        }else{
            for(int i = 0; i < parent.length; ++i) {
                if(parent[i] == rootX)
                    parent[i] = rootY;
            }
        }
        count --;
    }
    public int size(){
        return count;
    }
}
