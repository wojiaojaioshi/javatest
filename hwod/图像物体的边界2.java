import java.util.*;

public class 图像物体的边界2 {
    static Set<Integer> boundary = new HashSet<>();
    static int[][] offsets = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(getResult(matrix, m, n));
    }

    private static int getResult(int[][] matrix, int m, int n) {
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 5) {
                    boolean isAdj = search(matrix, i, j);
                    if (!isAdj) ans++;
                }
            }
        }
        return ans;
    }

    static boolean search(int[][] matrix, int x, int y) {
        boolean isAdj = false;
        for (int i = 0; i < offsets.length; i++) {
            int newX = x + offsets[i][0];
            int newY = y + offsets[i][1];
            if (newX >= 0 && newX < matrix.length && newY >= 0 && newY < matrix[0].length) {
                if (!boundary.contains(newX * matrix.length + newY)) {
                    boundary.add(newX * matrix.length + newY);
                    for (int j = 0; j < offsets.length; j++) {
                        int bX = newX + offsets[i][0];
                        int bY = newY + offsets[i][1];
                        if (boundary.contains(bX * matrix.length + bY)) {
                            isAdj = true;
                        }
                    }
                } else {
                    isAdj = true;
                }

            }
        }
        return isAdj;
    }

}
