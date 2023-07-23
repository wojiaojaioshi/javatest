import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class H {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set a=new HashSet();
        String b=new String();
        b=scanner.nextLine();
        int sum=0;
        char c[]=b.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            for (int j = i; j < c.length; j++) {
                a.add(c[j]);
                sum+=a.size();
            }
            a.clear();
        }
        System.out.println(sum);
    }
}
