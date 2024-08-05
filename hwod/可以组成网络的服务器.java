import java.util.LinkedList;
import java.util.Scanner;

public class 可以组成网络的服务器 {
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(getResult(arr));
    }

    static int getResult(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
//                    res = Math.max(res, bfs(arr, i, j));
                    int maxNum = dfs(arr, new boolean[arr.length][arr[0].length],  i, j);
                    res = Math.max(res, maxNum);
                }
            }
        }
        return res;
    }

    static int[][] offsets = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static int dfs(int[][] arr, boolean[][] vis, int x, int y) {
        if (!vis[x][y]) {
            vis[x][y] = true;
        } else return 0;
        int sum = 1;
        for (int[] offset : offsets) {
            int newX = x + offset[0];
            int newY = y + offset[1];
            if (newX >= 0 && newX < arr.length && newY >= 0 && newY < arr[0].length && !vis[newX][newY] && arr[newX][newY] == 1) {
                sum += dfs(arr, vis, newX, newY);
            }
        }
        return sum;
    }

    static int bfs(int[][] arr, int x, int y) {
        LinkedList<int[]> queue = new LinkedList<>();
        int count = 1;
        arr[x][y] = 0;
        queue.add(new int[]{x, y});
        while (queue.size() > 0) {
            int[] pos = queue.removeFirst();
            int px = pos[0];
            int py = pos[1];
            for (int[] offset : offsets) {
                int newX = px + offset[0];
                int newY = py + offset[1];
                if (newX >= 0 && newX < arr.length && newY >= 0 && newY < arr[0].length && arr[newX][newY] == 1) {
                    count++;
                    arr[newX][newY] = 0;
                    queue.add(new int[]{newX, newY});
                }
            }
        }
        return count;
    }
}
