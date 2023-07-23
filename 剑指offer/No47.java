import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class No47 {
    public static void main(String[] args) {
        int grid[][]={
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        maxValue(grid);
        System.out.println(maxv);
    }
    static int maxv=Integer.MIN_VALUE;
    public static int maxValue(int[][] grid) {
        dfs(new ArrayList<>(),0, 0, grid);
        return maxv;
//        int m=grid.length,n=grid[0].length;
//        int [][]dp=new int[m][n];
//        dp[0][0]=grid[0][0];
//        for(int i=1;i<m;i++)dp[i][0]=dp[i-1][0]+grid[i][0];
//        for(int i=1;i<n;i++)dp[0][i]=dp[0][i-1]+grid[0][i];
//        for (int i = 1; i <m ; i++) {
//            for (int j = 1; j <n ; j++) {
//                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
//            }
//        }
//        return dp[m-1][n-1];
    }
    static void   dfs(List<Integer>list,int x,int y,int grid[][])
    {
        int m=grid.length,n=grid[0].length;
        list.add(grid[x][y]);
        if(x==m-1&&y==n-1)
        {
            int sum=0;
            for (int d:list) {
                sum+=d;
            }
            if(sum>maxv)maxv=sum;
            return;
        }
        if(x+1<m)
        {
            dfs(list, x+1, y, grid);
            list.remove(list.size()-1);
        }
        if(y+1<n)
        {
            dfs(list, x, y+1, grid);
            list.remove(list.size()-1);
        }
    }
}
