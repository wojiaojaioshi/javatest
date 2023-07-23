import java.util.ArrayList;
import java.util.List;
//组合总和（无重复）
public class PPP {
    List<Integer>list=new ArrayList<>();
    List<List<Integer>>lists=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0,candidates,target);
        return lists;
    }
    void dfs(int cur,int []candidates,int target)
    {
        int sum=0;
        for (int x:list) {
            sum+=x;
        }
        if(sum==target)
        {
            lists.add(new ArrayList<>(list));
            return;
        }
        if(cur>=candidates.length)return;
        list.add(candidates[cur]);
        dfs(cur+1, candidates, target);
        list.remove(list.size()-1);
        dfs(cur+1, candidates, target);
    }
}
