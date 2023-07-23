import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 阿里3{
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        List<Integer>res=new ArrayList<>();
         int t=sc.nextInt();
         while (t-->0)
         {
             int n=sc.nextInt();
             int []num=new int[n];
             for (int i = 0; i < num.length; i++) {
                 num[i]=sc.nextInt();
             }
             Arrays.sort(num);
             int flat=n,sum=0;
        /* 1.最轻的每次都将船开回来，每次载一个；

         2.最轻的两先过去，最轻的那个开船回来让最重的两个过去，那边轻的再把船开回来
            */
             while (flat>=4)
             {
                 sum+=Math.min(num[0]*2+num[flat-1]+num[flat-2],
                         num[1]*2+num[0]+num[flat-1]);
                 flat-=2;
             }
             if(flat==3)sum+=num[0]+num[1]+num[2];
             else sum+=num[1];
             res.add(sum);
         }
        for (int x:res) {
            System.out.println(x);
        }
    }

}
