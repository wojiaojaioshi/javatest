import java.util.Arrays;
import java.util.Scanner;

public class 爱吃蟠桃的孙悟空 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] times = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int h = sc.nextInt();
        if (times.length > h) {
            System.out.println(0);
        } else {
            int sum = Arrays.stream(times).sum();
            int minTime = sum / h;
            int maxTime = Arrays.stream(times).max().orElse(0);
            for (int i = minTime; i <= maxTime; i++) {
                int timeSum = 0;
                for (int j = 0; j < times.length; j++) {
                    if (times[j] % i == 0) {
                        timeSum += times[j] / i;
                    } else {
                        timeSum += times[j] / i + 1;
                    }
                }
                if (timeSum <= h) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
