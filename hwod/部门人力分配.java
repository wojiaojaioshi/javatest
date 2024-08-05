import java.util.Arrays;
import java.util.Scanner;

public class 部门人力分配 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.nextLine());
        int[] requirements =
                Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(getResult(m, requirements));
    }

    public static long getResult(int m, int[] requirements) {
        Arrays.sort(requirements);
        int n = requirements.length;
        if (n == 1) {
            return requirements[0];
        }
        long max = requirements[n - 1] + requirements[n - 2];
        long min = requirements[n - 1];
        long ans = max;
        while (min <= max) {
            long mid = (max + min) >> 1;
            if (check(mid, m, requirements)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }

    public static boolean check(long limit, int m, int[] requirements) {
        Arrays.sort(requirements);
        int need=0;
        for (int i = 0; i <requirements.length ; i++) {
            if(i+1<requirements.length&&requirements[i]+requirements[i+1]<=limit){
                i++;
                need++;
            }else need++;
        }
        return need <= m;
    }
}
