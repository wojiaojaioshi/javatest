import java.util.*;

public class meituan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        List<Integer>list=new ArrayList<>();
        while (n-->0)
        {
            int temp=sc.nextInt();
            list.add(temp);
            while (list.size()>=2&&list.get(list.size()-1)==list.get(list.size()-2))
            {
                list.remove(list.size()-1);
                list.remove(list.size()-1);
                temp++;
                list.add(temp);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
