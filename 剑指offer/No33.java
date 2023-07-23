import java.util.Stack;

public class No33 {
    public boolean verifyPostorder(int[] postorder) {
//            Stack<Integer> stack = new Stack<>();
//            int root = Integer.MAX_VALUE;
//            for(int i = postorder.length - 1; i >= 0; i--) {
//                if(postorder[i] > root) return false;
//                while(!stack.isEmpty() && stack.peek() > postorder[i])
//                    root = stack.pop();
//                stack.add(postorder[i]);
//            }
//            return true;

        return recur(postorder, 0, postorder.length-1);
    }

    boolean recur(int[] postorder, int i, int j){
        int p=i;
        if(i>=j)return true;
        while(postorder[p]<postorder[j])p++;
        int m=p;
        while (postorder[p]>postorder[j])p++;
        return p==j&&recur(postorder, i,m-1 )&&recur(postorder, m, j-1);
    }
}
