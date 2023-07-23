import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 螺旋矩阵 {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        if(matrix==null)return null;
        int numsum=matrix.length*matrix[0].length;
        while (numsum>=1)
        {
            for (int i = left; i <=right&&numsum>=1 ; i++) {
                list.add(matrix[top][i]);
                numsum--;
            }
            top++;
            for (int i = top; i <=bottom&&numsum>=1 ; i++) {
                list.add(matrix[i][right]);
                numsum--;
            }
            right--;
            for (int i = right; i >=left&&numsum>=1 ; i--) {
                list.add(matrix[bottom][i]);
                numsum--;
            }
            bottom--;
            for (int i = bottom; i >=top&&numsum>=1 ; i--) {
                list.add(matrix[i][left]);
                numsum--;
            }
            left++;
        }
        return list;
    }
}
