public class 打印从1到n的数 {
    class Solution {
        char num[];
        int ans[];
        int count=0,n;//count是ans的计位
        public int[] printNumbers(int n) {
            this.n=n;
            num=new char[n];
            ans=new int[(int) (Math.pow(10, n)-1)];
            dfs(0);
            return ans;
        }
        void dfs(int x)
        {
            if(x==this.n)
            {
                String tmp=String.valueOf(num);
                int curnum=Integer.parseInt(tmp);
                if(curnum!=0)ans[count++]=curnum;
                return;
            }
            for (char i = '0'; i <='9'; i++) {
                num[x]=i;
                dfs(x+1);
            }
        }
    }
}
