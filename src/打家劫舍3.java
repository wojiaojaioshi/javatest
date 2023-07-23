import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class 打家劫舍3 {
    Map<TreeNode,Integer>selected=new HashMap<>();
    Map<TreeNode,Integer>notselected=new HashMap<>();
    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(selected.getOrDefault(root,0), notselected.getOrDefault(root,0));
    }
    void dfs(TreeNode node)
    {
        if(node==null)return;
        dfs(node.left);
        dfs(node.right);
        selected.put(node, node.val+notselected.getOrDefault(node.left, 0)+notselected.getOrDefault(node.right, 0));
        notselected.put(node, Math.max(selected.getOrDefault(node.left,0), notselected.getOrDefault(node.left,0))+Math.max(selected.getOrDefault(node.right,0), notselected.getOrDefault(node.right,0)));
    }
}
