public class pow {
    public static void main(String[] args) {
        System.out.println(myPow(2, Integer.MIN_VALUE));
    }
    public static double myPow(double x, int n) {
        if(n<0) {
            x=1/x;
            if(n<Integer.MAX_VALUE*-1&&Math.abs(x)!=1)return 0;
            n=Math.abs(n);
            return normalPower(x, n);
        }
        else {
            return normalPower(x, n);
        }
    }
    //快速幂实现法 位运算优化
    public static   double normalPower(double base,int power){
        double result=1;
        while(power>0){
            if(power%2!=0) result*=base;
            power>>=1;
            base*=base;
        }
        return result;
    }

}
