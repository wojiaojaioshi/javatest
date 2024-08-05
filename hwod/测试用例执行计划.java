import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 测试用例执行计划 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] priority = new int[n];
        int[][] score = new int[m][2];
        for (int i = 0; i < n; i++) {
            priority[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            int[] ids = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int x : ids) sum += priority[x - 1];
            score[i][0] = i;
            score[i][1] = sum;
        }
        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return o2[1] - o1[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        for (int[] ans : score) {
            System.out.println(ans[0]+1);
        }
    }
}
