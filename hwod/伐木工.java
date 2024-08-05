import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 伐木工 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>ans=new ArrayList<>();
        if (n < 3) {
            System.out.println(n);
        } else {
            while (n > 4) {
                n -= 3;
                ans.add(3);
            }
            ans.add(n);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i)+" ");
            }
        }
    }
}
