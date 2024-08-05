import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class 按身高和体重排队 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) heights[i] = sc.nextInt();

        int[] weights = new int[n];
        for (int i = 0; i < n; i++) weights[i] = sc.nextInt();

        System.out.println(getResult(n, heights, weights));
    }

    public static String getResult(int n, int[] heights, int[] weights) {
        int[][] students = new int[n][3];

        for (int i = 0; i < n; i++) {
            students[i] = new int[]{heights[i], weights[i], i + 1};
        }

        Arrays.sort(
                students, (a, b) -> {
                    if (a[0] != b[0]) {
                        return a[0] - b[0];
                    } else {
                        if (a[1] != b[1]) {
                            return a[1] - b[1];
                        } else {
                            return a[2] - b[2];
                        }
                    }
                });

        StringJoiner sj = new StringJoiner(" ");
        for (int[] student : students) {
            sj.add(student[2] + "");
        }
        return sj.toString();
    }
}
