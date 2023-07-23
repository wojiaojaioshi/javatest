public class 岛屿最大面积 {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length,n=grid[0].length,maxv=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(grid[i][j]==1)
                {
                     maxv=Math.max(maxv,dfs(grid, i, j));
                }
            }
        }
        return maxv;
    }
    int dfs(int [][]grid,int x,int y)
    {
        int m=grid.length,n=grid[0].length;
        if(x<0||x>=m||y<0||y>=n||grid[x][y]==0||grid[x][y]==2) return 0;
        grid[x][y]=2;
        int sum=0;
        sum=dfs(grid, x+1, y)+dfs(grid, x, y+1)+dfs(grid, x-1, y)+dfs(grid, x, y-1);
        return sum+1;
    }
}
