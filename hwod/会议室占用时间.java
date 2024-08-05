import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 会议室占用时间 {

    // 输入输出处理
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] roomTimes = new int[n][2];
        for (int i = 0; i < n; i++) {
            roomTimes[i][0] = sc.nextInt();
            roomTimes[i][1] = sc.nextInt();
        }

        int[][] res = merge(roomTimes);
        for (int[] time : res) {
            System.out.println(time[0] + " " + time[1]);
        }
    }

    // 本题实际考试时会核心代码模式，无需处理输入输出，只需要写出merge方法实现即可
    public static int[][] merge(int[][] roomTimes) {
        Arrays.sort(roomTimes, (x, y) -> x[0] - y[0]);
        int[] pre = roomTimes[0];
        List<int[]> ans = new ArrayList<>();
        for (int i = 1; i < roomTimes.length; i++) {
            int[] cur = roomTimes[i];
            if (cur[0] <= pre[1]) {
                pre[1] = Math.max(pre[1], cur[1]);
            } else {
                ans.add(pre);
                pre = cur;
            }
        }
        ans.add(pre);
        return ans.toArray(new int[0][]);
    }
}
