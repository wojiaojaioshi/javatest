public class 螺旋矩阵2 {
    public static void main(String[] args) {
        int [][]nusm=generateMatrix(3);
        for (int[]x :nusm) {
            for (int y:x) {
                System.out.println(y);
            }
        }
    }
    public static int[][] generateMatrix(int n) {
        int left=0,right=n-1,top=0,bottom=n-1;
        if(n==0)return null;
        int numsum=0;
        int [][]nums=new int[n][n];
        int flag=1;
        while(numsum<n*n)
        {
            for (int i = left; i <=right&&numsum<n*n ; i++) {
                nums[top][i]=flag++;
                numsum++;
            }
            top++;
            for (int i = top; i <=bottom&&numsum<n*n ; i++) {
                nums[i][right]=flag++;
                numsum++;
            }
            right--;
            for (int i = right; i >=left&&numsum<n*n ; i--) {
                nums[bottom][i]=flag++;
                numsum++;
            }
            bottom--;
            for (int i = bottom; i >=top&&numsum<n*n ; i--) {
                nums[i][left]=flag++;
                numsum++;
            }
            left++;
        }
        return nums;
    }
}
