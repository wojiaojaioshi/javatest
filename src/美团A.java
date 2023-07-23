import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;

public class 美团A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int x=sc.nextInt();
            if(finx(x)||finy(x)) System.out.println("yes");
            else System.out.println("no");
        }
    }
    static boolean finx(int x)
    {
        if(x%11==0)return true;
        else return false;
    }
    static boolean finy(int x)
    {
        int sum=0;
        while (x>0)
        {
            int temp=x%10;
            x/=10;
            if(temp==1)sum++;
        }
        if(sum>=2)return true;
        else return false;
    }
}
