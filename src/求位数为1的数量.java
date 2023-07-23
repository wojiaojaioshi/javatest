public class 求位数为1的数量 {
        public int hammingWeight(int n) {
            int res=0;
            while(n!=0)
            {
                n&=n-1;
                res++;
            }
            return res;
        }
}
