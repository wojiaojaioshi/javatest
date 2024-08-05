import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 篮球游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputs = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] outputs = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        // 利用队列结构模拟圆桶
        LinkedList<Integer> queue = new LinkedList<>();

        // outputs[index]是要被取出的篮球的编号
        int index = 0;

        // 记录题解
        StringBuilder sb = new StringBuilder();

        for (int input : inputs) {
            // 按照放入顺序，从圆桶右边放入
            queue.addLast(input);

            // 然后开始尝试取出
            while (!queue.isEmpty() && index < outputs.length) {
                // 圆桶左边的篮球的编号
                int left = queue.getFirst();
                // 圆桶右边的篮球的编号
                int right = queue.getLast();

                if (left == outputs[index]) {
                    // 优先比较圆桶左边的篮球是不是当前要取出的篮球，优先左边的原因是：当桶只有一个篮球的情况下，必须从左边取出
                    sb.append("L");
                    queue.removeFirst();
                    index++;
                } else if (right == outputs[index]) {
                    // 比较圆桶右边的篮球是不是当前要取出的篮球
                    sb.append("R");
                    queue.removeLast();
                    index++;
                } else {
                    // 如果圆桶左右两边都不是要取出的球，则本轮取出流程结束
                    break;
                }
            }
        }
        if (index != outputs.length) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
