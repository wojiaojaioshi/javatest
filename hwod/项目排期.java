import java.util.Arrays;
import java.util.Scanner;

public class 项目排期 {
    static Integer[] balls;
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        balls = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        n = Integer.parseInt(sc.nextLine());

        System.out.println(getResult());
    }

    public static int getResult() {
        // 这里对balls降序，有利于降低后面回溯操作的复杂度
        Arrays.sort(balls, (a, b) -> b - a);

        // 二分范围：即每个桶的容量最小，最大值
        int min = Arrays.stream(balls).reduce(Integer::sum).get()/n; // 桶至少要有max(balls)的容量
        int max = Arrays.stream(balls).reduce(Integer::sum).get(); // 当只有一个桶时，此时该桶容量要装下所有balls

        // 记录题解
        int ans = max;

        // 二分找中间值作为桶容量
        while (min <= max) {
            int mid = (min + max) >> 1;

            if (check(0, new int[n], mid)) {
                // 如果k个mid容量的桶，可以装完所有balls，那么mid容量就是一个可能解，但不一定是最优解，我们应该尝试更小的桶容量
                ans = mid;
                max = mid - 1;
            } else {
                // 如果k个mid容量的桶，无法装完所有balls，那么说明桶容量取小了，我们应该尝试更大的桶容量
                min = mid + 1;
            }
        }

        return ans;
    }

    public static boolean check(int index, int[] buckets, int limit) {
        if (index == balls.length) return true;
        int cur = balls[index];
        for (int i = 0; i < buckets.length; i++) {
            if (i > 0 && buckets[i] == buckets[i - 1]) continue;
            if (cur + buckets[i] <= limit) {
                buckets[i] += cur;
                if (check(index + 1, buckets, limit)) return true;
                buckets[i] -= cur;
            } else {
                continue;
            }
        }
        return false;
    }
}
