package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 网易D {
    static int vist[][];
    static List<List<Integer>>lists=new ArrayList<>();
    static int maxv=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int [][]a=new int[n][m];
        vist=new int[n][m];
        for (int i = 0; i <n ; i++)
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        dfs(0, 0, a, new ArrayList<>());
        System.out.println(maxv);
    }
    static void dfs(int x,int y,int [][]a,List<Integer>list)
    {
        list.add(a[x][y]);
        vist[x][y]=1;
        if(x==a.length-1&&y==a[0].length-1)
        {
            int sum=list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i).intValue()==list.get(i-1).intValue())sum+=1;
                else sum+=2;
            }
            maxv=Math.min(maxv, sum);
        }
        if(y-1>=0&&vist[x][y-1]!=1)
        {
            dfs(x,y-1, a, list);
            list.remove(list.size()-1);
        }

        if(x+1<a.length&&vist[x+1][y]!=1)
        {
            dfs(x+1,y, a, list);
            list.remove(list.size()-1);
        }
        if(y+1<a[0].length&&vist[x][y+1]!=1)
        {
            dfs(x,y+1, a, list);
            list.remove(list.size()-1);
        }
        vist[x][y]=0;
    }

}
