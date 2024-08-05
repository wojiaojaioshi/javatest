import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 传递悄悄话 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] times = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 记录题解
        int ans = 0;

        // 根节点的索引是0
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(0);

        while (queue.size() > 0) {
            int cur = queue.poll();
            int lchild = 2 * cur + 1;
            int rchild = 2 * cur + 2;
            boolean lflag = lchild < times.length && times[lchild] != -1;
            boolean rflag = rchild < times.length && times[rchild] != -1;
            if (lflag) {
                queue.addLast(lchild);
                times[lchild] += times[cur];
            }
            if (rflag) {
                queue.addLast(rchild);
                times[rchild] += times[cur];
            }
            if (!lflag && !rflag) {
                ans = Math.max(times[cur], ans);
            }
        }


        System.out.println(ans);
    }

}
