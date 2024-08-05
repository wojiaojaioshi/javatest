import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringJoiner;

public class 生成哈夫曼树 {
    // 哈夫曼树节点
    static class Node {
        Node lchild; // 左孩子节点
        Node rchild; // 右孩子节点
        int weight; // 当前节点的权重
        int height; // 当前节点代表子树的高度

        public Node(Node lc, Node rc, int weight, int height) {
            this.lchild = lc;
            this.rchild = rc;
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 将哈夫曼树节点进行排序，方便后面筛选出权值最小的两个节点
        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        (a, b) ->
                                a.weight != b.weight
                                        ? a.weight - b.weight
                                        : a.height - b.height); // 题目说：当左右节点权值相同时，左子树高度小于等于右子树高度。因此当节点权重相同时，再按照节点子树高度升序
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            Node node = new Node(null, null, weight, 0);
            pq.offer(node);
        }
        while (pq.size() > 1) {
            Node lc = pq.poll();
            Node rc = pq.poll();
            Node father = new Node(lc, rc, lc.weight + rc.weight, Math.max(lc.height, rc.height) + 1);
            pq.offer(father);
        }
        Node root = pq.poll();
        StringJoiner sj = new StringJoiner(" ");
        midOrder(root, sj);
        System.out.println(sj);
    }

    public static void midOrder(Node root, StringJoiner sj) {
        if (root == null) return;
        midOrder(root.lchild, sj);
        sj.add(String.valueOf(root.weight));
        midOrder(root.rchild, sj);
    }
}
