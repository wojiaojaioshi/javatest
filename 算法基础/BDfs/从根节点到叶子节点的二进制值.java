public class 从根节点到叶子节点的二进制值 {
    int ans;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    void dfs(TreeNode node,int preVal)
    {
        if(node==null)return ;
        int sum=preVal*2+node.val;
        if(node.left==null&&node.right==null)
        {
            ans+=sum;
            return;
        }
        dfs(node.left, preVal);
        dfs(node.right, preVal);
    }
}
