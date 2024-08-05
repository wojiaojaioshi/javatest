import java.util.Scanner;

public class API集群负载统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        String[] find = sc.nextLine().split(" ");
        int m = Integer.valueOf(find[0]), ans = 0;
        String fstr = find[1];
        for (int i = 0; i < str.length; i++) {
            String temp = str[i];
            int k = 0;
            for (int j = 0; j < temp.length(); j++) {
                char c = temp.charAt(j);
                if (c == '/') {
                    k++;
                    if (k == m) {
                        if (j + fstr.length() >= temp.length()) {
                            break;
                        }
                        String tempSub = temp.substring(j + 1, j + 1 + fstr.length());
                        if (tempSub.equals(fstr)) {
                            ans++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
