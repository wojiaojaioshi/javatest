import java.util.*;

public class 欢乐的周末bfs {
    static int[][] offsets = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 长度m表示行数
        int m = sc.nextInt();
        // 宽度n表示列数
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(getResult2(matrix));
    }

    static int getResult(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int meetCount = 0;
        Map<Integer, Integer> meetMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 2) {
                    //已走过
                    boolean[][] vis = new boolean[m][n];
                    LinkedList<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    vis[i][j] = true;

                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0];
                        int y = cur[1];
                        if (matrix[x][y] == 3) {
                            meetMap.put(x * n + y, meetMap.getOrDefault(x * n + y, 0) + 1);
                        }
                        for (int[] offset : offsets) {
                            int newX = x + offset[0];
                            int newY = y + offset[1];
                            if (newX >= 0 && newX < m && newY >= 0 && newY < n && matrix[newX][newY] != 1 && !vis[newX][newY]) {
                                queue.offer(new int[]{newX, newY});
                                vis[newX][newY] = true;
                            }
                        }
                    }
                }
            }
        }
        for (int x : meetMap.keySet()) {
            if (meetMap.get(x) >= 2) {
                meetCount++;
            }
        }
        return meetCount;
    }

    static int getResult2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int meetCount = 0;
        Map<Integer, Integer> meetMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 2) {
                    boolean vis[][] = new boolean[m][n];
                    dfs(matrix, meetMap, i, j, vis);
                }
            }
        }
        for (int x : meetMap.keySet()) {
            if (meetMap.get(x) >= 2) {
                meetCount++;
            }
        }
        return meetCount;
    }

    static void dfs(int[][] matrix, Map<Integer, Integer> meetMap, int x, int y, boolean[][] vis) {
        if (vis[x][y] || matrix[x][y] == 1) {
            return;
        }
        if (matrix[x][y] == 3) {
            meetMap.put(x * matrix[0].length + y, meetMap.getOrDefault(x * matrix[0].length + y, 0) + 1);
        }
        vis[x][y] = true;
        for (int[] offset : offsets) {
            int newX = x + offset[0];
            int newY = y + offset[1];
            if (newX >= 0 && newX < matrix.length && newY >= 0 && newY < matrix[0].length && matrix[newX][newY] != 1 && !vis[newX][newY])
                dfs(matrix, meetMap, newX, newY, vis);
        }
    }

}
