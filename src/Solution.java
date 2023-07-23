import java.util.ArrayList;
import java.util.List;

 class Solutiona {
    List<Integer>list=new ArrayList<>();
    List<List<Integer>>lists=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,list,nums);
        return lists;
    }
    public void dfs(int cur,List<Integer>list,int [] nums)
    {
        if(cur==nums.length)
        {
            lists.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[cur]);
        dfs(cur+1,list,nums);
        list.remove(list.size()-1);
        dfs(cur+1, list, nums);

    }
}
