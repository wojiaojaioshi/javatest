import java.util.*;

public class meituan17 {
    static List<Integer>list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [][]s=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j]=sc.nextInt();
            }
        }
        for (int i = 1; i <=n ; i++) {
            searcha(s,i);
        }
        for (int x:list) {
            System.out.print(x+" ");
        }
    }

    static void searcha(int[][]s,int index)
    {
        for (int i = 0; i < s[0].length; i++) {
            if(!list.contains(s[index-1][i]))
            {
                list.add(s[index-1][i]);
                break;
            }
        }
    }
}
