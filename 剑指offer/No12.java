public class No12 {
    public boolean exist(char[][] board, String word) {
        char[] word1 = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word1, i, j, 0)) return true;
            }
        }
        return false;

    }
    boolean dfs(char [][]board,char []word,int x,int y,int k)
    {
        if(x<0||x>=board.length||y<0||y>=board[0].length||word[k]!=board[x][y]||board[x][y]=='0')
            return false;
        if(k==word.length-1)return true;
        board[x][y]='0';
        boolean res=dfs(board,word,x+1,y,k+1)||dfs(board,word,x-1,y,k+1)||dfs(board,word,x,y+1,k+1)||dfs(board,word,x,y-1,k+1);
        board[x][y]=word[k];
        return res;
    }
}
