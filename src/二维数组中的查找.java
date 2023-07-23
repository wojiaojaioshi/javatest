public class 二维数组中的查找 {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if(matrix.length==0||matrix[0].length==0||matrix==null)
            {
                return false;
            }
            int row=matrix.length-1,col=0;
            while (row>=0&&col<matrix[0].length)
            {
                if(matrix[row][col]==target)return true;
                else if(matrix[row][col]<target)col++;
                else row--;
            }
            return false;
        }
    }
}
