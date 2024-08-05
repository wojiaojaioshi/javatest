import java.util.Scanner;

public class 计算三叉搜索树的高度 {
    static class TreeNode {
        int val; // 节点值
        int height; // 节点所在高度
        TreeNode left; // 左子树
        TreeNode mid; // 中子树
        TreeNode right; // 右子树

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static class Tree {
        TreeNode root; // 树的根节点
        int height; // 树的高度


        public void add(Integer val) {
            TreeNode node = new TreeNode(val);
            if (this.root == null) {
                node.height = 1;
                this.height = 1;
                root = node;
            } else {
                TreeNode cur = root;
                while (true) {
                    node.height = cur.height + 1;
                    this.height = Math.max(this.height, node.height);
                    if (val < cur.val - 500) {
                        if (cur.left != null) {
                            cur = cur.left;
                        } else {
                            cur.left = node;
                            break;
                        }
                    } else if (val > cur.val + 500) {
                        if (cur.right != null) {
                            cur = cur.right;
                        } else {
                            cur.right = node;
                            break;
                        }
                    } else {
                        if (cur.mid != null) {
                            cur = cur.mid;
                        } else {
                            cur.mid = node;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            tree.add(num);
        }

        System.out.println(tree.height);
    }
}
