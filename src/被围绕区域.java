public class 被围绕区域 {
    public void solve(char[][] board) {
        int m= board.length,n=board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if((i==0||i==m-1||j==0||j==n-1)&&board[i][j]=='O')
                dfs(board,i,j);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='#')board[i][j]='O';
            }
        }

    }
    void dfs(char[][] board,int x,int y)
    {
        int m= board.length,n=board[0].length;
        if(x<0||x>=m||y<0||y>=n-1||board[x][y]=='X'||board[x][y]=='#')return;
        board[x][y]='#';
        dfs(board, x+1, y);
        dfs(board, x, y+1);
        dfs(board, x-1, y);
        dfs(board, x, y-1);
    }
}
