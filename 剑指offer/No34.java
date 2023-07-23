import java.util.ArrayList;
import java.util.List;

public class No34 {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target, new ArrayList<>());
        return ans;
    }
    void dfs(TreeNode root,int target,List<Integer>list)
    {
        if(root==null)return;
        list.add(root.val);
        if(!list.isEmpty()&&target-root.val==0&&(root.left==null&&root.right==null)){
            ans.add(new ArrayList<>(list));

        }
        if(target-root.val>0)
        dfs(root.left, target-root.val, list);
        dfs(root.right, target-root.val, list);
        list.remove(list.size()-1);
    }
}
