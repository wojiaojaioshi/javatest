import java.util.HashMap;
import java.util.Map;

public class 求二叉树的最小高度 {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            if (root.left == null && root.right == null) {
                return 1;
            }

            int min_depth = Integer.MAX_VALUE;
            /**
             * 递归，找到每个节点的最小值
             */
            if (root.left != null) {
                min_depth = Math.min(minDepth(root.left), min_depth);
            }
            if (root.right != null) {
                min_depth = Math.min(minDepth(root.right), min_depth);
            }

            return min_depth + 1;
        }
}
