import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class 阿里8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] strParams = br.readLine().trim().split(" ");
        int[] worshipId = new int[n + 1];
        int[] tickets = new int[n + 1];
        Arrays.fill(tickets, 1);
        for(int i = 0; i < n; i++) worshipId[i + 1] = Integer.parseInt(strParams[i]);
        for(int i = n; i >= 1; i--)
            tickets[worshipId[i]] += tickets[i];   // 有崇拜对象，假设把自己身上所有的票都投给崇拜对象
        for(int i = 1; i <= n; i++)
            System.out.println(tickets[i]);
    }
}
