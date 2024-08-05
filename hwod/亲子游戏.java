import java.util.LinkedList;
import java.util.Scanner;

public class 亲子游戏 {

    static int n;
    static int[][] matrix;
    static int[][] candy;
    static int[][] offsets = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        matrix = new int[n][n];
        candy = new int[n][n];

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                candy[i][j] = -1;
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == -3) {
                    candy[i][j] = 0;
                    queue.addLast(i * n + j);
                }
            }
        }
        int ans = -1;
        while (!queue.isEmpty()) {
            boolean flag = false;
            LinkedList<Integer> newQueue = new LinkedList<>();
            for (int cur : queue) {
                int x = cur / n;
                int y = cur % n;
                for (int[] offset : offsets) {
                    int newX = x + offset[0];
                    int newY = y + offset[1];

                    if (newX < 0 || newX >= n || newY < 0 || newY >= n || matrix[newX][newY] == -1) continue;

                    if (candy[newX][newY] == -1) {
                        newQueue.addLast(newX * n + newY);
                    }

                    candy[newX][newY] = Math.max(candy[newX][newY], candy[x][y] + Math.max(0, matrix[newX][newY]));

                    if (matrix[newX][newY] == -2) {
                        ans = candy[newX][newY];
                        flag = true;
                    }
                }
            }
            if (flag) {
                break;
            }
            queue = newQueue;
        }
        System.out.println(ans);
    }
}
