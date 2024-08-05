import java.util.*;
import java.util.stream.Collectors;

public class 内存冷热标记 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int k = sc.nextInt(), flag = 0;
        for (Integer x : map.keySet()) {
            if (map.get(x) >= k) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            map = map.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() >= k)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    if (o1.getValue() != o2.getValue()) {
                        return o2.getValue() - o1.getValue();
                    } else {
                        return o1.getKey() - o2.getKey();
                    }
                }
            });
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getKey());
            }
        } else System.out.println(0);
    }
}
