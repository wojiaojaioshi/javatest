//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class 美团C {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),sum=n;
//        int m=sc.nextInt();
//        Set<Integer> set=new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            int x=sc.nextInt();
//            int y=sc.nextInt();
//            boolean fx,fy;
//            fx=insert(x, set);
//            fy=insert(y, set);
//            if(!(fx&&fy))
//            {
//                set.remove(x);
//                set.re
//                sum--;
//            }
//        }
//        System.out.println(sum);
//    }
//    static boolean insert(int x,Set<Integer> set)
//    {
//        if(set.add(x))return true;
//        else return false;
//    }
//}
