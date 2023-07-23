public class 二叉树的直径 {
        int ans=1;
        public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
          return ans-1;
        }
        int dfs(TreeNode nood)
        {
            if(nood==null)return 0;
            int l=dfs(nood.left);
            int r=dfs(nood.right);
            ans=Math.max(ans,l+r+1);
            return Math.max(l, r)+1;
        }


}
