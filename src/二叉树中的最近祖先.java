//public class 二叉树中的最近祖先 {
//
//        private TreeNode ans;
//
//        public Solution() {
//            this.ans = null;
//        }
//
//        private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
//            if (root == null) return false;
//            boolean lson = dfs(root.left, p, q);
//            boolean rson = dfs(root.right, p, q);
//            //当前节点的左右节点同时包含p或q或者包含一个并且当前节点是p或 q
//            if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
//                ans = root;
//            }
//            //lson和rson就是它的子节点中包含了p或q
//            return lson || rson || (root.val == p.val || root.val == q.val);
//        }
//
//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            this.dfs(root, p, q);
//            return this.ans;
//        }
//}
