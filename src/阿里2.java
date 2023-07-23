import java.util.*;

public class 阿里2 {

    public static void main(String[] args) {
        List<List<Integer>>lists=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int []nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=i+1;
        }
        dfs(n,m,list,0,nums,lists);
        for (int i = 0; i < lists.size(); i++) {
            for (int x:lists.get(i)) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    static void dfs(int n,int m,List<Integer>list,int index,int []nums,List<List<Integer>>lists)
    {
        if(list.size()==m)
        {
            Collections.sort(list);
            if(!lists.contains(list))
            {
                List<Integer>temp=new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    temp.add(list.get(i));
                }
                lists.add(temp);
            }
            return;
        }
        if(index>=nums.length)return;
        list.add(nums[index]);
            dfs(n, m, list, index+1,nums,lists);
            list.remove(list.size()-1);
            dfs(n, m, list, index+1,nums,lists);

    }
}
