public class 求根节点到叶子节点之和 {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    int dfs(TreeNode node,int presum)
    {
        if(node==null)
            return 0;
        int sum=presum*10+node.val;
        if(node.right==null&&node.left==null)
        {
            return sum;
        }
        else return dfs(node.left, sum)+dfs(node.right, sum);
    }
}
