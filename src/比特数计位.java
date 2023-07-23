public class 比特数计位 {
    public int[] countBits(int n) {
        int []dp=new int[n+1];int highbit=0;
        for (int i = 1; i <=n ; i++) {
            if((i&(i-1))==0)
            {
                highbit=i;
            }
            dp[i]=dp[i-highbit]+1;
        }
        return dp;
    }
}
