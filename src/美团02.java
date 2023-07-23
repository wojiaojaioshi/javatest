//import java.util.Scanner;
//
//public class 美团02 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n + 1];
//        int[] mx = new int[n + 1];
//        int[] sum = new int[n + 1];
//        int[] mval = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            a[i] = sc.nextInt();
////            sum[i] = sum[i - 1] + a[i];
//        }
////        int ans = 0;
////        for (int i = 1, s = 0; i <= n; i++) {
////            s += a[i];
////            if (s < 0) s = 0; // 求最大
////            mx[i] = Math.max(mx[i - 1], s);
////            mval[i] = Math.max(mval[i - 1], mx[i] - sum[i]);
////            ans = Math.max(ans, sum[i] + mval[i - 1]);
////        }
//        int ans=0;
//        for (int i = 1,s=0; i <=n ; i++) {
//            s+=a[i];
//            if(s<0)s=0;
//            mx[i]=Math.max(mx[i-1],s);
//            for (int j = 1; j <i ; j++) {
//                ans=Math.max()
//            }
//        }
//        System.out.println(ans);
//    }
//}
