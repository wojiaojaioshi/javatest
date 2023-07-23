import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int flat =0;
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while (!queue.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            int tempsize=queue.size();
            for (int i = 0; i < tempsize; i++) {
                TreeNode listNode=queue.poll();
                list.add(listNode.val);
                if(listNode.left!=null)queue.add(listNode.left);
                if(listNode.right!=null)queue.add(listNode.right);
            }
            if(flat%2==0)
            {
                ans.add(list);
                flat++;
            }else
            {
                List<Integer>insteadlist=new ArrayList<>();
                for (int i = list.size()-1; i >=0 ; i--) {
                    insteadlist.add(list.get(i));
                }
                ans.add(insteadlist);
                flat++;
            }
        }
        return ans;
    }
}
