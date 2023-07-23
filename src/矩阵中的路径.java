public class 矩阵中的路径 {
    class Solution {
        public boolean exist(char[][] board, String word) {
            char []word1=word.toCharArray();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                       return dfs(board, word1, i,j, 0);
                }
            }
            return false;
        }
        boolean dfs(char[][]board,char word[],int i,int j,int k)
        {
            if(i<0||i>=board.length||j<0||j>=board[0].length||word[k]!=board[i][j])return false;
            if(k==word.length-1)return true;
            board[i][j]='0';
            boolean res=dfs(board, word, i+1, j, k+1)||dfs(board, word, i-1, j, k+1)||dfs(board, word, i, j+1, k+1)||dfs(board, word, i, j-1, k+1);
            board[i][j]=word[k];
            return res;
        }
    }
}
