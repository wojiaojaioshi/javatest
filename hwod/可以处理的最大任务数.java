import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 可以处理的最大任务数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] ranges = new int[n][2];
        for (int i = 0; i < n; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        System.out.println(getResult2(ranges));

    }

    private static int getResult2(int[][] tasks) {
// 任务按开始时间升序
        Arrays.sort(tasks, (a, b) -> a[0] - b[0]);
// 优先队列存储结束时间，升序
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
        int dealLine = Arrays.stream(tasks).flatMapToInt(Arrays::stream).max().getAsInt();
        int idx = 0, n = tasks.length, ans = 0;
        for (int cur = 1; cur <= dealLine; cur++) {
// 遍历任务，所有 cur 时间可以开始执行的任务都入队
// idx 控制任务只会共完整遍历一次
            while (idx < n && tasks[idx][0] <= cur) {
                q.add(tasks[idx][1]);
                idx++;
            }
// 去除过期任务
            while (!q.isEmpty() && q.peek() < cur) {
                q.poll();
            }
// cur 时间选择执行队首任务
            if (!q.isEmpty()) {
                ans++;
                q.poll();
            }
        }
        return ans;
    }
}
