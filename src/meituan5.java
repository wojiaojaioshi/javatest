import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class meituan5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        if(n < 2178){
            System.out.println(0);
        }else{
            int num = 2178;
            int count = 0;
            ArrayList<String> res = new ArrayList<>();
            while(num <= n / 4){
                int revNum = reverse(num);
                if(4*num == revNum){
                    count ++;
                    res.add(num + " " + revNum);
                }
                num ++;
            }
            System.out.println(count);
            for(int i = 0; i < res.size(); i++)
                System.out.println(res.get(i));
        }
    }
    private static int reverse(int num){
        int res = 0;
        while(num > 0){
            res = res*10 + num%10;
            num /= 10;
        }
        return res;
    }
}
