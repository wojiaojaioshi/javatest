import java.util.*;

public class meituan7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String start=" ";
        int sum=0;
        for (int i = 0; i < n; i++) {
            String a1=sc.next();
            String a2=sc.next();
            if(start.equals(" "))
            {
                start=a1;
            }
            if(a2.equals(start))
            {
                start=" ";
                sum++;
            }
        }
        System.out.println(sum);
    }

}
