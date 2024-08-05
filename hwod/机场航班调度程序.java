import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 机场航班调度程序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(0) != o2.charAt(0)) {
                    return o1.charAt(0) - o2.charAt(0);
                } else {
                    if (o1.charAt(1) != o2.charAt(1)) {
                        return o1.charAt(1) - o2.charAt(1);
                    } else {
                        String l = o1.substring(2);
                        String r = o2.substring(2);
                        return l.compareTo(r);
                    }
                }
            }
        });
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i] + ",");
        }
        System.out.print(str[str.length - 1]);
    }
}
