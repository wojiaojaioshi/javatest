import org.omg.CORBA.FREE_MEM;

public class 表示数值的字符串 {
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if(matrix==null)return null;
            int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
            int num= matrix.length*matrix[0].length;
            int ans[]=new int[matrix.length*matrix[0].length],k=0;
            while(num>=1)
            {
                for (int i = left; i <=right&&num>=1 ; i++) {
                    ans[k++]=matrix[top][i];
                    num--;
                }
                top++;
                for (int i = top; i <=bottom&&num>=1 ; i++) {
                    ans[k++]=matrix[i][right];
                    num--;
                }
                right--;
                for (int i = right; i >=left&&num>=1 ; i--) {
                    ans[k++]=matrix[bottom][i];
                    num--;
                }
                bottom--;
                for (int i = bottom; i >=top&&num>=1 ; i--) {
                    ans[k++]=matrix[i][left];
                    num--;
                }
                left++;
            }
            return ans;

        }
    }
}
