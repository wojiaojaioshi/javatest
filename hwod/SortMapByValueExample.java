import java.util.*;

public class SortMapByValueExample {
    public static void main(String[] args) {
        // 创建一个示例Map
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 80);
        map.put("Alice", 95);
        map.put("Bob", 75);
        map.put("Diana", 90);

        // 将Map转换为List，存储其中的Entry
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // 使用Collections.sort对List进行排序，根据Entry的value值降序排序
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // 根据value值降序排序
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // 构建一个新的有序MapLinkedHashMap来存放排序后的结果
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // 输出排序后的Map
        System.out.println("按照value值降序排序后的Map：");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
