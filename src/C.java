import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s = scanner.nextLine();
        char [] a=s.toCharArray();
        int len=0,maxlen=0;
        Set<Character>set=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(set.contains(a[i]))
            {
                for (int j = i; j >=i-len+1 ; j--) {
                    if(a[j]==a[i])
                    {
                        len=0;
                        break;
                    }
                }
            }
            else {
                len+=1;
            }
            set.add(a[i]);
            if(maxlen<len)maxlen=len;
        }
        System.out.println(maxlen);
    }
}
