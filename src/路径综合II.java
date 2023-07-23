import java.util.ArrayList;
import java.util.List;

public class 路径综合II {
    List<List<Integer>>lists=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         dfs(root, targetSum, new ArrayList<>());
        return lists;
    }
    void dfs(TreeNode node,int target,List<Integer>list)
    {
        if(node==null)return;
        list.add(node.val);
        if(node.right==null&&node.left==null)
        {
            Integer sum=0;
            List<Integer>res=new ArrayList<>();
            for (Integer x:list) {
                sum+=x;
            }
            if(sum==target)
            {
                for (Integer x:list) {
                    res.add(x);
                }
                lists.add(res);
            }
            return;
        }
        if(node.left!=null)
        {
            dfs(node.left, target, list);
            list.remove(list.size()-1);
        }

        if(node.right!=null)
        {
            dfs(node.right, target, list);
            list.remove(list.size()-1);
        }
    }
}
