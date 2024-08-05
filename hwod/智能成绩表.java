
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 智能成绩表 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[][] score = new String[n][1 + m];
        String[] course = sc.nextLine().split(" ");
        String appoint = null;
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextLine().split(" ");
        }

        if (sc.hasNext()) {
            appoint = sc.nextLine();
        }
        Comparator<String[]> comparator = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (!o1[1].equals(o2[1])) {
                    return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
                } else {
                    return o1[0].compareTo(o2[0]);
                }
            }
        };

        int index = -1;
        for (int i = 0; i < course.length; i++) {
            if (course[i].equals(appoint)) {
                index = i;
                break;
            }
        }

        if (appoint == null || appoint.equals(" ")||index==-1) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j < 1 + m; j++) {
                    sum += Integer.parseInt(score[i][j]);
                }
                score[i][1] = String.valueOf(sum);
            }
            Arrays.sort(score, comparator);
        } else {

            for (int i = 0; i < n; i++) {
                score[i][1] = score[i][1 + index];
            }
            Arrays.sort(score, comparator);
        }
        for (String[] x : score) {
            System.out.print(x[0] + " ");
        }
    }
}
