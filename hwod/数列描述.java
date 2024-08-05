import java.util.Scanner;

public class 数列描述 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSeq(n));
    }

    public static String getSeq(int n) {
        String base = "1";
        for (int i = 1; i <= n; i++) {
            base = describe(base);
        }
        return base;
    }

    public static String describe(String seq) {
        StringBuilder sb = new StringBuilder();
        int preCount = 0;
        for (int i = 0; i < seq.length(); i++) {
            char cur = seq.charAt(i);
            if (i > 0 && cur != seq.charAt(i - 1)) {
                if (preCount > 0) {
                    sb.append(preCount);
                    sb.append(seq.charAt(i - 1));
                    preCount = 1;
                }
            } else if (i > 0 && cur == seq.charAt(i - 1)) {
                preCount++;
            } else if (i == 0) {
                preCount++;
            }
        }
        if (preCount > 0) {
            sb.append(preCount).append(seq.charAt(seq.length() - 1));
        }
        return sb.toString();
    }
}
