import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dasdsa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        while (list.size()!=0) {
            int temp=list.get(0);
            if(temp%2!=0)ans+=temp-1;
            else if(temp<=4)ans+=temp-1;
            else {
                int a=temp/2;
                int b=2;
                list.add(a);
                list.add(b);
                ans++;
            }
            list.remove(0);
        }
        System.out.println(ans);

    }
}
