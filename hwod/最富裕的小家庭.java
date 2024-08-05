import java.util.*;

public class 最富裕的小家庭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> weal = new HashMap<>();
        Map<Integer, List<Integer>> childs = new HashMap<>();
        int maxWeal = 0;
        for (int i = 1; i <= n; i++) {
            weal.put(i, sc.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            Integer father = sc.nextInt();
            Integer child = sc.nextInt();
            if (childs.containsKey(father)) {
                childs.get(father).add(child);
            } else {
                List<Integer> childList = new ArrayList<>();
                childList.add(child);
                childs.put(father, childList);
            }
        }
        for (Integer x : childs.keySet()) {
            Integer wealSum = weal.get(x);
            for (Integer c : childs.get(x)) {
                wealSum += weal.get(c);
            }
            maxWeal = Math.max(wealSum, maxWeal);
        }
        if (weal.size() == 1) weal.values().stream().forEach(System.out::println);
        else System.out.println(maxWeal);
    }
}
