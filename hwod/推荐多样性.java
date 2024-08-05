import java.util.Scanner;
import java.util.StringJoiner;

public class 推荐多样性 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = (int) Math.ceil(n * 1.0 / m);
        int[][] matrix = new int[m][k];
        int step = 1, x = 0, y = 0;
        while (step <= n) {
            while (y < k && matrix[x][y] == 0 && step <= n) matrix[x][y++] = step++;
            y--;
            x++;
            while (x < m && matrix[x][y] == 0 && step <= n) matrix[x++][y] = step++;
            x--;
            y--;
            while (y >= 0 && matrix[x][y] == 0 && step <= n) matrix[x][y--] = step++;
            y++;
            x--;
            while (x >= 0 && matrix[x][y] == 0 && step <= n) matrix[x--][y] = step++;
            x++;
            y++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}
