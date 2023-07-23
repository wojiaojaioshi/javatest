package a;

import java.util.Scanner;

public class 网易A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        int ans=0;
        if(x<2*y){
            while (a>0&&b>0)
            {
                a-=y;
                b-=y;
                ans++;
            }
            if(a>0)
            {
                for (int i = 0; i < a; i++) {
                    a-=x;
                    ans++;
                    if(a<=0)break;
                }
            }
            if(b>0)
            {
                for (int i = 0; i < b; i++) {
                    b-=x;
                    ans++;
                    if(b<=0)break;
                }
            }
        }
        else {
            for (int i = 0; i < a; i++) {
                a-=x;
                ans++;
                if(a<0)break;
            }
            for (int i = 0; i < b; i++) {
                b-=x;
                ans++;
                if(b<0)break;
            }
        }
        System.out.println(ans);
    }
}
