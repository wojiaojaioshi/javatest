public class NO1 {
    int maxSum=Integer.MAX_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }
    public int maxGain(TreeNode node)
    {
        if(node==null)return 0;
        int left=Math.max(maxGain(node.left), 0);
        int right=Math.max(maxGain(node.right), 0);
        int nodePrice=node.val+left+right;
        maxSum=Math.max(maxSum,nodePrice);
        return node.val+Math.max(left, right);
        
    }


}
