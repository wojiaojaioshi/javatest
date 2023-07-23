import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoB {
    static int []num;
    static Set<Integer>set=new HashSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=sc.nextInt();
            set.add(num[i]);
        }
        int ans[]=new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]=findmex(i);
        }
        for (int x:ans) {
            System.out.print(x+" ");
        }
    }
    static int findmex(int x)
    {
        int flat=0;
        set.remove(num[x]);
        for (int i = 0; i < num.length; i++) {
            if(!set.contains(i))
            {
                flat=i;
                break;
            }
        }
        set.add(num[x]);
        return flat;

    }
}
