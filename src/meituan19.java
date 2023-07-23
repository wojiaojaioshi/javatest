import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class meituan19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=0;
        Set<Integer>set=new HashSet<>();
        for (int i = 0; i < p; i++) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < q; i++) {
            if(!set.add(sc.nextInt()))r++;
        }
        int res1=p-r,res2=q-r;
        System.out.print(res1+" "+res2+" "+r);
    }
}
