import javax.swing.text.MutableAttributeSet;
import java.util.ArrayList;
import java.util.List;

public class 最小路径和 {
    private int [][]ans;
    public int [][] temp;
    public  int minPathSum(int[][] grid) {
        ans=new int[grid.length][grid[0].length];

        int minv=dfs(0, 0, grid);
        return minv;
    }
     public int dfs(int x, int y, int [][]grid)
    {
        temp=new int[grid.length][grid[0].length];
        if(x==grid.length&&y==grid[0].length)return Integer.MAX_VALUE;
        if(x==grid.length-1&&y==grid[0].length-1)
        {
            return temp[0][0];
        }
        if(temp[x][y]!=0)return temp[x][y];
        else
        {
            int next= Math.min(dfs(x+1, y, grid), dfs(x, y+1, grid));
            int now=next+grid[x][y];
            temp[x][y]=now;
            return now;
        }

    }
}
