import java.util.PriorityQueue;
import java.util.Scanner;

public class 寻找最优的路测线路 {
    static int[][] offsets = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] dist = new int[r * c];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        dist[0] = matrix[0][0];
        pq.add(0);
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            int x = cur / c;
            int y = cur % c;
            if (x == r - 1 && y == c - 1) break;
            for (int[] offset : offsets) {
                int newX = x + offset[0];
                int newY = y + offset[1];
                if (newX < 0 || newX >= r || newY < 0 || newY >= c) continue;
                int w = Math.min(dist[cur], matrix[newX][newY]);
                if (dist[newX * c + newY] < w) {
                    dist[newX * c + newY] = w;
                    pq.add(newX * c + newY);
                }
            }
        }
        System.out.println(dist[(r - 1) * c + (c - 1)]);
    }
}
