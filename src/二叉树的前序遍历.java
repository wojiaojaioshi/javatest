import java.util.ArrayList;
import java.util.List;

public class 二叉树的前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        dfs(list, root);
        return list;
    }
    void  dfs(List<Integer>list,TreeNode node)
    {
        if(node==null)return;
        list.add(node.val);
        if(node.left!=null)
        {
            dfs(list, node.left);
        }
        if(node.right!=null)
        {
            dfs(list, node.right);
        }
    }
}
