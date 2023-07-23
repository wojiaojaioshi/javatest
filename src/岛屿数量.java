public class 岛屿数量 {
    private int rlen,clen;
        public int numIslands(char[][] grid) {
            rlen=grid.length;
            clen=grid[0].length;
            int ans=0;
            for (int i = 0; i <rlen ; i++) {
                for (int j = 0; j <clen ; j++) {
                    if(grid[i][j]=='1')
                    {
                        dfs(grid, i,j );
                        ans++;
                    }
                }
            }
            return ans;
        }
    void dfs(char[][] grid, int r, int c)
    {
        if(r<0||r>=rlen||c<0||c<clen||grid[r][c]=='0')
        {
            return;
        }
        grid[r][c]='0';
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }
}
