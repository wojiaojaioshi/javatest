import java.util.LinkedList;
import java.util.Queue;

public class 对称二叉树 {
        public boolean isSymmetric(TreeNode root) {
            return check(root, root);
        }

//        public boolean check(TreeNode p, TreeNode q) {
//            if (p == null && q == null) {
//                return true;
//            }
//            if (p == null || q == null) {
//                return false;
//            }
//            return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
//        }
    public boolean check(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            TreeNode u = queue.poll();
            TreeNode v = queue.poll();
            if (u == null && v == null)continue;
            if (u == null || v == null||u.val != v.val) return false;
                queue.add(u.left);
                queue.add(v.right);
                queue.add(u.right);
                queue.add(v.left);

        }
        return false;
    }
}
