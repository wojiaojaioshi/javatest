import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class 阿里5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        for(int i = 0; i < n; i++)
            x[i] = Integer.parseInt(br.readLine().trim().split(" ")[0]);
        Arrays.sort(x);
        int median = x[n / 2];
        long res = 0;
        for(int i = 0; i < n; i++) res += Math.abs(median - x[i]);
        System.out.println(res);
    }
}

