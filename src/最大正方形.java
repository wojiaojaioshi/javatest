public class 最大正方形 {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int [][]dp=new int[m][n];
        int maxv=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j]=matrix[i][j]-'0';
//                System.out.print(dp[i][j]+" ");
                if(i>0&&j>0)
                {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),Math.min(dp[i-1][j-1], dp[i][j]))+1;
                    maxv=Math.max(dp[i][j],maxv);
                }
            }
//            System.out.println();
        }
        return maxv*maxv;
    }
}
