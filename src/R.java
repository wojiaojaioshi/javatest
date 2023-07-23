public class R {
    public static void main(String[] args) {
        System.out.println(a(1534236469));
    }
    public static int a(int x)
    {          if(x==0)return x;
        long n=0;
        while(x!=0)
        {
            n=n*10+x%10;
            x/=10;
        }
        return (int)n==n? (int) n :0;
    }
}
