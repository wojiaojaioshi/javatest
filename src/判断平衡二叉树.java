import java.util.Map;

public class 判断平衡二叉树 {
        public boolean isBalanced(TreeNode root) {
            if(root==null)
                return true;
            else
            {
                if(Math.abs(height(root.left)-height(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right))
                    return true;
                else return false;
            }


        }
        public int height(TreeNode node)
        {
            if(node==null)
                return 0;
            else return Math.max(height(node.left), height(node.right))+1;
        }
}
