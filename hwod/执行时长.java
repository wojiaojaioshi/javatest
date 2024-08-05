import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class 执行时长 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int[] task = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int remain = 0, time = 0, i = 0;
        while (true) {
            if (i < n) {
                if (remain > 0) {
                    task[i] += remain;
                }
                remain = task[i] - k > 0 ? task[i] - k : 0;
                time++;
                i++;
            } else {
                time += remain % k == 0 ? remain / k : remain / k + 1;
                break;
            }
        }
        System.out.println(time);
    }
}
