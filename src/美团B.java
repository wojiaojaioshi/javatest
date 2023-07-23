import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 美团B {
    public static void main(String[] args) {
        List<List<Integer>>lists=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int []a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            List<Integer>list=new ArrayList<>();
            for (int j = i; j <n ; j++) {
                list.add(a[j]);
                if(f(list))
                {
                    List<Integer>temp=new ArrayList<>();
                    for (int k = 0; k < list.size(); k++) {
                        temp.add(list.get(k));
                    }
                    lists.add(temp);
                }
            }
        }
        System.out.println(lists.size());

    }
    static boolean f(List<Integer>list)
    {
        if(list.size()==0)return false;
        int ans=1;
        for (int i = 0; i < list.size(); i++) {
            ans*=list.get(i);
        }
        if(ans>0)return true;
        else return false;
    }
//    static List<List<Integer>>lists=new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        List<Integer>list=new ArrayList<>();
//        int n=sc.nextInt();int []a=new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextInt();
//        }
//        dfs(a,list,lists, 0);
//        System.out.println(lists.size()-1);
//
//    }
//    static void dfs(int []a,List<Integer >list,List<List<Integer>>lists,int index)
//    {
//        if(list.size()>0)
//        {
//            int ans=1;
//            for (int i = 0; i < list.size(); i++) {
//                ans*=list.get(i);
//            }
//            if(ans>0)
//            {
//                List<Integer>temp=new ArrayList<>();
//                for (int i = 0; i < list.size(); i++) {
//                    temp.add(list.get(i));
//                }
//                lists.add(temp);
//            }
//        }
//            if(index+1<a.length)
//            {
//                list.add(a[index]);
//                dfs(a, list, lists, index+1);
//
//                list.remove(list.size()-1);
//                dfs(a, list, lists, index+1);
//
//            }
//
//    }
}
