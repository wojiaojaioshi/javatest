public class No16 {
        public double myPow(double x, int n) {
            if(x == 0) return 0;
            long b = n;
            double res = 1.0;
            //如果幂是负数，那么把底数倒过来，指数变正数
            if(b < 0) {
                x = 1 / x;
                b = -b;
            }
            while(b > 0) {
                //如x^9=(x^1*1)*(x^0*2)*(x^0*4)*(x^1*8)
                //换成二进制，数位为1，那就乘上
                if((b & 1) == 1) res *= x;
                //
                x *= x;
                //数位右移一位
                b =b>> 1;
            }
            return res;
        }
}
