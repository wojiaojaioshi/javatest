
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sajdsajo {
    static int []arr;
    static int []parent;
    static Map<Integer,Integer>map;
    static int maxSum=Integer.MAX_VALUE;
    public static void main(String[] args) {
        map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         arr=new int[n+1];
         parent=new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            parent[i]=sc.nextInt()-1;
        }
        int ans=maxPathSum(1);
        System.out.println(ans);
    }
    static int maxPathSum(int root)
    {
        maxGain(root);
        return maxSum;
    }
    static int maxGain(int node)
    {
        if(node>5)return 0;
        int left=Math.max(maxGain((node-1)*2+1), 0);
        int right=Math.max(maxGain((node-1)*2+2), 0);
        int priceNewpath=arr[node]+left+right;
        maxSum=Math.max(maxSum, priceNewpath);
        return arr[node]+Math.max(left, right);
    }

}
