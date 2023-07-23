public class 青蛙上台阶 {
    public int numWays(int n) {
        int l=1,r=1,sum=0;
        for (int i = 0; i < n; i++) {
            sum=(l+r)%1000000007;
            l=r;
            r=sum;
        }
        return l;
    }
}
