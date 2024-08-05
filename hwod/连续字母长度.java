import java.util.*;
import java.util.stream.Collectors;

public class 连续字母长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        Map<Character, Integer> finds = new HashMap<>();
        char tempC = ' ';
        int tempLen = 0;
        char pre = ' ';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (pre == c) {
                finds.put(c, finds.getOrDefault(c, 0) + 1);
            } else {
                if (finds.containsKey(c)) {
                    tempC = c;
                    tempLen = finds.get(c);
                }
                if (pre == tempC) {
                    int len = finds.getOrDefault(tempC, 0);
                    finds.put(tempC, Math.max(len, tempLen));
                }
                finds.put(c, 1);
            }
            pre = c;
        }
        finds.remove(' ');
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(finds.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        if (k <= list.size() && k >= 1) {
            System.out.println(list.get(k - 1).getValue());
        } else {
            System.out.println(-1);
        }

//        Map<Character, Integer> sortMap = new LinkedHashMap<>();
//        for (Map.Entry<Character, Integer> entry : list) {
//            sortMap.put(entry.getKey(), entry.getValue());
//            System.out.println(entry.getValue());
//        }

    }
}
