public class 搜索二维矩阵2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length,n=matrix[0].length;
        int x=0,y=n-1;
        while (x<m&&y>=0)
        {
            if(target==matrix[x][y])
            {
                return true;
            }
            else if(matrix[x][y]>target)
                y--;
            else x++;
        }
        return false;
    }
}
