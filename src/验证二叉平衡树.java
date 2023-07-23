//public class 验证二叉平衡树 {
//    public boolean isValidBST(TreeNode root) {
//    return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
//}
//    boolean dfs(TreeNode node,Long lower,Long upper)
//    {
//        if(node==null)return true;
//        if(node.val<=lower||node.val>=upper)return false;
//        return dfs(node.left,lower,node.val)&&dfs(node.right,node.val,upper);
//    }
//}
