import java.util.Arrays;
import java.util.Scanner;

public class 堆内存申请 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] memory = new int[100];
        boolean flag = true;
        while (sc.hasNext()) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (input[0] + input[1] >= 100) {
                System.out.println(-1);
                flag = false;
                break;
            } else {
                for (int i = input[0]; i < input[0] + input[1]; i++) {
                    if (memory[i] == 0) {
                        memory[i] = 1;
                    } else {
                        System.out.println(-1);
                        flag = false;
                        break;
                    }
                }
            }
        }
        if (flag) {
            System.out.println(getResult(memory, t));
        }
    }

    static int getResult(int[] memory, int t) {
        int[] ans = {1000, 0};
        for (int i = 0; i < 100; i++) {
            int len = 0;
            if (memory[i] == 0) {
                for (int j = i; j < 100; j++) {
                    if (memory[j] == 0) len++;
                    else {
                        if (len >= t && len < ans[0]) {
                            ans[0] = len;
                            ans[1] = i;
                        }
                        i = j;
                        break;
                    }
                }
            }
        }
        return ans[1];
    }
}
