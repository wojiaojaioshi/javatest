import java.util.Scanner;
import java.util.StringJoiner;

public class 考勤信息 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[][] records = new String[n][];
        for (int i = 0; i < n; i++) {
            records[i] = sc.nextLine().split(" ");
        }

        getResult(n, records);
    }

    public static void getResult(int n, String[][] records) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 0; i < n; i++) {
            sj.add(isAward(records[i]) + "");
        }

        System.out.println(sj);
    }

    public static boolean isAward(String[] record) {
        int absent = 0, present = 0;
        String pre = " ";
        for (int i = 0; i < record.length; i++) {
            String cur = record[i];
            if (i >= 7) {
                if (record[i - 7].equals("present")) present--;
            }
            switch (cur) {
                case "absent":
                    if (++absent > 1) return false;
                    break;
                case "present":
                    present++;
                    break;
                case "leaveearly":
                case "late":
                    if (pre.equals("leaveearly") || pre.equals("late")) return false;
                    break;
            }
            pre = cur;
            int len = Math.min(i + 1, 7);
            if (len - present > 3) return false;
        }
        return true;
    }
}
