public class J1 {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    public static int climbStairs(int n) {
       int l=0,r=0,s=1;
        for (int i =1; i <n+1 ; i++) {
            l=r;
            r=s;
            s=l+r;
        }
        return s;
    }
}
