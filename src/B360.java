import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B360 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        Set<String>a1,b1,c1;
        a1=new HashSet<>();b1=new HashSet<>();c1=new HashSet<>();
        for (int i = 0; i < a; i++) a1.add(sc.next());
        for (int i = 0; i < b; i++) b1.add(sc.next());
        for (int i = 0; i < c; i++) c1.add(sc.next());
        int n=sc.nextInt();
        for (int i = 0; i <n; i++)
        {
            String str=sc.nextLine();
            String ss[]=str.split( "\\s");
            if(ss.length!=3)
            {
                System.out.println("NO");
                continue;
            }
            if(a1.contains(ss[0])&&b1.contains(ss[1])&&c1.contains(ss[2]))
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
