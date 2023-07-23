import java.util.*;

public class NOC {
    static Map<Integer,Integer>map=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        char znum[]=new char[n+1];
        for (int i = 1; i <n ; i++) {
            num[i]=sc.nextInt();
            map.put(i+1, num[i]);
        }
        String str=sc.next();
        znum=str.toCharArray();
        int ans[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ans[i]=find(i+1, znum,n);
            System.out.print(ans[i]+" ");
        }


    }
    static int find(int index,char []znum,int n)
    {
        LinkedList<Integer>queue=new LinkedList<>();
        Set<Character>directory=new HashSet<>();
        queue.offer(index);
        while(!queue.isEmpty())
        {
            int tem=queue.poll();
            directory.add(znum[tem-1]);
            int i=1;
            while(map.containsValue(tem)&&i<=n)
            {
                if(map.getOrDefault(i,-1)==tem)
                {
                    queue.add(i);
                }
                i++;
            }
        }
        return directory.size();
    }
}
