public class husd {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    public static int arrangeCoins(int n) {
        int k=0,o=0;
        while (n-k>0)
        {
            k++;
            n-=k;
            o++;
        }
        return o;
    }
}
