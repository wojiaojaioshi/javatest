import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 精准核酸检测 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] confirmed = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(getResult(n, confirmed, matrix));
    }

    public static int getResult(int n, int[] confirmed, int[][] matrix) {
        UnionFindSet unionFindSet = new UnionFindSet(n);
        int[] father = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    unionFindSet.union(i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int fa = unionFindSet.find(i);
            father[fa]++;
        }
        Set<Integer> faSet = new HashSet<>();
        for (int i = 0; i < confirmed.length; i++) {
            int fa = unionFindSet.find(confirmed[i]);
            if (faSet.contains(fa)) {
                continue;
            } else {
                faSet.add(fa);
                int nums = father[fa];
                ans += nums;
            }
        }
        return ans - confirmed.length;
    }
}
