import java.util.*;

public class 电脑病毒感染 {
    static HashMap<Integer, ArrayList<int[]>> graph = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); // 出发点
            int v = sc.nextInt(); // 目标点
            int w = sc.nextInt(); // 出发点到达目标点的耗时

            graph.putIfAbsent(u, new ArrayList<>());
            graph.get(u).add(new int[]{v, w});
        }

        int start = sc.nextInt();
        boolean[] visited = new boolean[n + 1];
        int ans = dfs(start, visited);
        boolean flag = true;
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println(ans);
        else System.out.println(-1);
    }

    static int dfs(int index, boolean[] vis) {
        if (vis[index]) return 0;
        else vis[index] = true;
        List<int[]> childs = graph.get(index);
        int max = 0, sum = 0;
        if (childs != null && childs.size() != 0) {
            for (int[] c : childs) {
                sum = c[1] + dfs(c[0], vis);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
