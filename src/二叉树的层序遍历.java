import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans=new ArrayList<>();
            Queue<TreeNode> queue=new LinkedList();
            queue.add(root);
            while (!queue.isEmpty())
            {
                List<Integer> list=new ArrayList<>();
                for (int i = 0; i < queue.size(); i++) {
                    TreeNode listNode=queue.poll();
                    list.add(listNode.val);
                    if(listNode.left!=null)
                    {
                        queue.add(listNode.left);
                    }
                    if(listNode.right!=null)queue.add(listNode.right);
                }

                ans.add(list);
            }

            return ans;
        }
}
