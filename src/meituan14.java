import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class meituan14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer>res=new ArrayList<>();
        for (int i =n ; i <=m ; i++) {
            int temp=i,sum=0;
            while (temp>0)
            {
                int t=temp%10;
                sum+=Math.pow(t,3);
                temp/=10;
            }
            if(sum==i)res.add(i);
        }
        if(res.size()==0) System.out.println("no");
        else
            for (int x:res) {
                System.out.print(x+" ");
            }
    }
}
