import java.util.LinkedList;

public class 奇偶数 {
    public boolean isEvenOddTree(TreeNode root) {
        LinkedList<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        boolean even=true;//true表示偶数
        while(!queue.isEmpty())
        {
            int levelSize=queue.size();

            int preVal=even?Integer.MIN_VALUE:Integer.MAX_VALUE;
            while(levelSize-->0)
            {
                TreeNode curNode=queue.poll();
                if(even&&(curNode.val%2==0||curNode.val<=preVal))
                {
                    return false;
                }
                if(!even&&(curNode.val%2==1||curNode.val>=preVal))
                {
                    return false;
                }
                preVal=curNode.val;
                if(curNode.left!=null)
                {
                    TreeNode L=curNode.left;
                    queue.add(L);
                }
                if(curNode.right!=null)
                {
                    TreeNode R=curNode.right;
                    queue.add(R);
                }
            }
            even=!even;
        }
        return true;
    }
}
