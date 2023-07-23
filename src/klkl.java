public class klkl {
    public boolean exist(char[][] board, String word) {
        boolean [][]booleans=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                boolean flag=dfs(board, word.toCharArray(), 0, i, j, booleans);
                if(flag)return true;

            }
        }
        return false;
    }
    boolean dfs(char[][] board,char[] word,int k,int i,int j,boolean visisted[][])
    {
        if(board[i][j]!=word[k])return false;
        else if(k==word.length-1)return true;
        visisted[i][j]=true;
        boolean result=false;
        int direct[][]={{0,-1},{0,1},{-1,0},{1,0}};
        for (int []x:direct) {
            int newi=i+x[0],newj=j+x[1];
            if(newi>=0&&newi<board.length&&newj>=0&&newj<board[0].length)
            {
                if(!visisted[newi][newj])
                {
                   boolean flag= dfs(board, word, k, newi,newj, visisted);
                   if(flag)
                   {
                       result=true;
                       break;
                   }

                }
            }
        }
        visisted[i][j]=false;
        return result;

    }
}
