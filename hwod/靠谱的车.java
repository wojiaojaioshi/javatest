import java.util.Arrays;
import java.util.Scanner;

public class 靠谱的车 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println(getResult(arr));
    }

    public static int getResult(int[] arr) {
        int correct = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int cur = arr[i];
            if (cur > 4) cur--;
            for (int j = 0; j < arr.length - (i) - 1; j++) {
                cur *= 9;
            }
            correct += cur;
        }

        return correct;
    }
}
