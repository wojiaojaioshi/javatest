import java.util.List;

public class 单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]=new boolean[s.length()+1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <=i; j++) {
                if(dp[j]&&wordDict.contains(s.substring(j,i)))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
