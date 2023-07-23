public class 爬楼梯 {
    public int climbStairs(int n) {
        int[] flag=new int[n];
        int sum=dfs(0, n, flag);
        return sum;
    }
    int dfs(int k,int target,int []flag)
    {
        if(k>target)return 0;
        if(k==target)return 1;
        if(flag[k]!=0)return flag[k];
        return flag[k]=dfs(k+1, target, flag)+dfs(k+2, target, flag);

    }
}
