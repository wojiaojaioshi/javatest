import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 二叉树的广度优先遍历 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String post = sc.next();
        String mid = sc.next();

        System.out.println(getResult(post, mid));
    }

    public static String getResult(String post, String mid) {
        LinkedList<String[]> queue = new LinkedList<>();
        ArrayList<Character> ans = new ArrayList<>();
        devideLR(post, mid, queue, ans);
        while (queue.size() > 0) {
            String[] temp = queue.removeFirst();
            devideLR(temp[0], temp[1], queue, ans);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : ans) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void devideLR(
            String post, String mid, LinkedList<String[]> queue, ArrayList<Character> ans) {
        char root = post.charAt(post.length() - 1);
        ans.add(root);
        int rootId = mid.indexOf(root);
        int leftLen = rootId;
        if (leftLen > 0) {
            String leftPost = post.substring(0, leftLen);
            String leftMid = mid.substring(0, leftLen);
            queue.add(new String[]{leftPost, leftMid});
        }
        int rightLen = post.length() - 1 - leftLen;
        if (rightLen > 0) {
            String rightPost = post.substring(leftLen, post.length() - 1);
            String rightMid = mid.substring(leftLen + 1);
            queue.add(new String[]{rightPost, rightMid});
        }
    }
}
