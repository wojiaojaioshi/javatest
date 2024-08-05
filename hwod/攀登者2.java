import java.util.*;
import java.util.stream.Collectors;

public class 攀登者2 {
    // 输入处理
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] heights = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int strength = Integer.parseInt(sc.nextLine());
        List<Integer> height = Arrays.stream(heights).boxed().collect(Collectors.toList());
        System.out.println(getResult(height, strength));
    }

    // 算法实现（本题实际考试为核心代码模式，因此考试时只需要写出此函数实现即可）
    public static int getResult(List<Integer> heights, int strength) {
        // 记录可攀登的山峰索引
        HashSet<Integer> idxs = new HashSet<>();

        // 正向攀登
        climb(heights, strength, idxs, true);
        Collections.reverse(heights);
        // 逆序攀登
        climb(heights, strength, idxs, false);

        return idxs.size();
    }

    public static void climb(List<Integer> heights, int limit, HashSet<Integer> idxs, boolean direction) {
        int i = 0, count = 0;

        while (i < heights.size() && heights.get(i) != 0) {
            i++;
        }
        for (int j = i + 1; j < heights.size(); j++) {
            if (heights.get(j) == 0) {
                count = 0;
                continue;
            }
            int diff = heights.get(j) - heights.get(j - 1);
            if (diff > 0) {
                count += 3 * diff;
                if (j + 1 >= heights.size() || heights.get(j) > heights.get(j + 1)) {
                    if (count < limit) {
                        if (direction) {
                            idxs.add(j);
                        } else {
                            idxs.add(heights.size() - 1 - j);
                        }
                    }
                }
            } else if (diff < 0) {
                count -= 3 * diff;
            }
        }
    }
}
