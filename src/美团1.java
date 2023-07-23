import java.util.*;

public class 美团1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>list=new ArrayList<>();
        int []dp=new int[n];dp[0]=1;
        for (int i = 0; i <n ; i++)
        {
            int temp=sc.nextInt();
            if(!list.contains(temp))
            {
                list.add(temp);
            }
        }
        Collections.sort(list);
        for (int i = 1; i <list.size() ; i++) {
            dp[i]=dp[i-1];
            if(list.get(i)>list.get(i-1)+1)
            {
                dp[i]=Math.max(dp[i],dp[i-1]+1);
            }
            dp[i]=Math.max(dp[i],dp[i-2]+1);
        }
        int ans=0;
        for (int i = 0; i < dp.length; i++) {
            ans=Math.max(ans,dp[i]);
        }
        System.out.println(ans);
    }
}
