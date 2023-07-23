import java.util.*;
import java.util.stream.Collectors;

public class meituan10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]shop=new int[n+1][3];
        Map<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>sortmap=new LinkedHashMap<>();
        for (int i = 1; i <=n ; i++) {
            int v=sc.nextInt();
            int w=sc.nextInt();
            map.put(i,searchsum(v,w));
        }
        map.entrySet().stream()
                .sorted((p1,p2)->p2.getValue().compareTo(p1.getValue()))
                .collect(Collectors.toList()).forEach(ele -> sortmap.put(ele.getKey(), ele.getValue()));
        int []res=new int[m];
        int flat=0;
        for (Integer x: sortmap.keySet()) {
            if(flat==res.length)break;
            res[flat++]=x;
        }
        Arrays.sort(res);
        for (int i = 0; i < m; i++) {
            System.out.print(res[i]+" ");
        }
    }
    static int searchsum(int v,int m)
    {
        return v+m*2;
    }
}

