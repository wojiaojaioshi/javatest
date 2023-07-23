import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的右视图 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList();
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        queue.add(root);

        while(!queue.isEmpty())
        {
            int tempsize=queue.size();
            for (int i = 0; i < tempsize; i++) {
                TreeNode node= queue.poll();
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                if(i==tempsize-1)list.add(node.val);
            }
        }
        return list;
    }
}
