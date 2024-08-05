import javax.annotation.processing.SupportedSourceVersion;
import java.lang.reflect.Array;
import java.util.*;

public class 查找一个有向网络的头节点和尾节点 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(-1);
            return;
        }
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, ArrayList<Integer>> next = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            set.add(a);
            set.add(b);
            inDegree.put(b, inDegree.getOrDefault(b, 0) + 1);
            next.putIfAbsent(a, new ArrayList<>());
            next.get(a).add(b);
        }
        int total = set.size();
        int count = 0;
        int head = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (Integer p : set) {
            if (!inDegree.containsKey(p)) {
                queue.addLast(p);
                head = p;
                break;
            }
        }
        ArrayList<Integer> tails = new ArrayList<>();

        while (!queue.isEmpty()) {
            int fa = queue.removeFirst();
            count++;
            if (!next.containsKey(fa)) {
                tails.add(fa);
                continue;
            }
            for (Integer child : next.get(fa)) {
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    queue.add(child);
                }
            }
        }

        if (total != count) {
            System.out.println(-1);
        } else {
            Collections.sort(tails);
            StringJoiner sj = new StringJoiner(" ");
            sj.add(String.valueOf(head));
            for (int j = 0; j < tails.size(); j++) {
                sj.add(String.valueOf(tails.get(j)));
            }
            System.out.println(sj);
        }
    }
}
