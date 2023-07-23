public class 有序矩阵中第k小的元素 {
    public int kthSmallest(int[][] matrix, int k) {
        int l=matrix[0][0],r=matrix[matrix.length-1][matrix[0].length-1];

        while (l<r)
        {
            int m=l+(r-l)/2;
            if(check(matrix, k, m))
            {
                r=m;
            }else {
                l=m+1;
            }
        }
        return l;

    }
    boolean check(int [][]matrix,int k,int m)
    {
        int i=matrix.length-1,j=0;
        int num=0;
        while (i>=0&&j<matrix.length)
        {
            if(matrix[i][j]<=m)
            {
                num+=i+1;
                j++;
            }
            else {
                i--;
            }
        }
        return num>=k;
    }

}
