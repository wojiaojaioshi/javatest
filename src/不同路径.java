public class 不同路径 {
    public static void main(String[] args) {

    }
    int direct[][]={{1,0},{0,1}};
    public  int uniquePaths(int m, int n) {
        int [][]nums=new int[3][7];
        dfs(0,0 , m,n,nums);
        return nums[0][0];
    }
   int dfs(int i,int j,int m,int n,int [][]nums)
    {
        if(i==m-1&&j==n-1)
        {
            return 1;
        }
        if(nums[i][j]!=0)
        {
            return nums[i][j];
        }
        int sum=0;
        for (int []x:direct) {
            int newi=i+x[0],newj=j+x[1];
            if(newi>=m||newj>=n)continue;
            sum+= dfs(newi, newj,m,n,nums);
        }
        nums[i][j]=sum;
        return sum;
    }
}
