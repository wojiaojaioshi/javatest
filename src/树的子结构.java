public class 树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null)return false;
        if(A.val==B.val&&(recur(A.left,B.left)&&recur(A.right,B.right)))return true;

        return isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    boolean recur(TreeNode node1, TreeNode node2) {
        if(node2==null)return true;
        if(node1==null)return false;
        if(node1.val==node2.val)
        {
            return recur(node1.left,node2.left)&&recur(node1.left,node2.right);
        }
        return  false;
    }
}
