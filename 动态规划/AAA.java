import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AAA {
       static int []start;
       static int []end;
       static Map<Integer,Integer>map;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        start=new int[n];
        end=new int[n];
        int ans=0;
        map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            start[i]=sc.nextInt();
            map.put(start[i],i);
        }
        for (int i = 0; i < n; i++) {
            end[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(!find(end[i],end[i+1],n))ans++;
        }
        System.out.println(ans);
    }
    static boolean find(int x,int y,int n){
        for(int i=map.get(x)+1;i<n;i++)
        {
            if(start[i]==y)return true;
        }
        return false;
    }
}
