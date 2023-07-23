package a;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 网易B {
    static char temp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();int maxv=0;
        char a[]=str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(!(a[i]>='a'&&a[i]<='z'))continue;
            temp=a[i];
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]>='a'&&a[j]<='z')
                {
                    if(find(a[j]))
                    {
                        maxv+=a[i]-'a'+1;
                        maxv+=a[j]-'a'+1;
                        a[j]='#';
                        break;
                    }
                }
                else {
                    continue;
                }
            }
            temp=' ';
            a[i]='#';
        }
        System.out.println(maxv);
    }
    static boolean find(char x)
    {
        if(temp==x)return true;
        if((x-'a'+1==temp-'a'+2)||(x-'a'+1==temp-'a'))return true;

        return false;
    }
}

