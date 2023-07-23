import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JSIOaj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []a;
        String ans = "";
        String str=sc.next();
        a=str.split(";");
        int i=0,j=0,k1=1,k2=1;
        while(i<a[0].length()&&j<a[1].length())
        {
            if(a[0].charAt(i)=='-'&&k1!=-1){
                 k1=-1;
                 i++;
                 continue;
            }k1=1;
            if(a[1].charAt(j)=='-'&&k2!=-1)
            {
                 k2=-1;
                 j++;continue;
            }else k2=1;
            if(k1*Integer.valueOf(a[0].charAt(i))==k2*Integer.valueOf(a[1].charAt(j)))
            {
                i++;j++;
                continue;
            }else if(k1*Integer.valueOf(a[0].charAt(i))>k2*Integer.valueOf(a[1].charAt(j)))
            {
                ans+=a[1].charAt(j);
                j++;
            }else
            {
                ans+=a[0].charAt(i);
                i++;
            }
        }
        if(i<a[0].length())ans+=a[0].substring(i);
        else ans+=a[1].substring(j);
        char []res=ans.toCharArray();
        System.out.println(res);
    }
}
