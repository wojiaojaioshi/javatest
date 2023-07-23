import java.util.*;

public class 百度B {
    public static void main(String[] args) {
        Set<Long>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),sum;
        while (t-->0)
        {
            sum=1;
            long n=sc.nextLong();
            for (long i = 2; i <=Math.sqrt(n) ; i++) {
                long k=n/i;
                if(n%i==0&&!set.contains(k))
                {
                    if(GreatestCommonDivisor((int)i,(int)k)!=1)continue;
                    else {
                        set.add(i);
                        set.add(k);
                        sum++;
                    }
                }
            }
            set.clear();
            list.add( sum);
        }
        for (int x:list) {
            System.out.println(x);
        }
    }
    static int GreatestCommonDivisor(int a, int b) {
        int t;

        if (a < b) {
            // 交换两个数，使大数放在a的位置上。
            t = a;
            a = b;
            b = t;
        }

        while (b != 0) {
            // 利用辗转相除法，直到b为0为止。
            t = a % b;
            a = b;
            b = t;
        }

        return a;
    }

}
