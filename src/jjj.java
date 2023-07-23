import java.util.ArrayList;
import java.util.List;

public class jjj {

    List<Integer> list=new ArrayList<>();
    List<List<Integer>>lists=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0,candidates,target,0,list);
        return lists;
    }
    void dfs(int cur,int []candidates,int target,int sum,List<Integer>list)
    {
        if(cur==candidates.length)return;
        if(sum==target)//递归出口
        {
            lists.add(new ArrayList<>(list));
            return;
        }
        //当前不选，取下一个
        dfs(cur+1, candidates, target,sum,list);
        if(sum+candidates[cur]<=target)//选当前的
        {
            list.add(candidates[cur]);
            dfs(cur, candidates, target,sum+candidates[cur],list);
            //选当前，但cur数组下标不变，这样可以重复取元素
            list.remove(list.size()-1);
        }
    }
}
