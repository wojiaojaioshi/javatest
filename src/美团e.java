import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 美团e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int parent[]=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i <=n ; i++) {
            parent[i]=sc.nextInt();
        }
        int sum0=0,sum1=0;
        for (int i = 1; i <=n ; i++) {
            List<Integer>son=finson(i,parent);
             if(a[i]==0){
                if(son.size()==0)sum0++;
                else {
                    for (int j = 0; j <son.size() ; j++) {
                        if(a[son.get(j)]==1)
                        {
                            sum0++;
                            break;
                        }
                    }
                }
            }
            else if(a[i]==1)
             {
                 if(son.size()==0)sum1++;
                 else
                 {
                     int flat=0;
                     for (int j = 0; j <son.size() ; j++) {
                         if(a[son.get(j)]==1)
                         {
                             flat=1;
                             break;
                         }
                     }
                     if(flat==0)sum1++;
                 }
             }
        }
        System.out.println(sum0+" "+sum1);

    }
    static List<Integer>finson(int x,int []parent)
    {
        List<Integer>son=new ArrayList<>();
        for (int i = 1; i <parent.length ; i++) {
            if(parent[i]==x)son.add(i);
        }
        return son;
    }
}
