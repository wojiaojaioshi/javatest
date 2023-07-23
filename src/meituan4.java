import java.util.*;


public class meituan4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n + 1];
        nodes[1] = 0;
        int max = 0;
        int dis = 0;//花店到各个地点的距离总和
        int count = 0;//所有边的总和
        int cost = 0;//最短距离
        for (int i = 1; i <= n - 1; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int value = sc.nextInt();
            nodes[y] = nodes[x] + value;
            dis += nodes[y];
            count += value;
            max = Math.max(max, nodes[y]);
        }
        cost = count * 2 - max;
        System.out.println(dis + " " + cost);
    }
}
