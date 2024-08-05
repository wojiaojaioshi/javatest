import java.time.format.SignStyle;
import java.util.*;
import java.util.stream.Collectors;

public class 数组去重和排序 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(",");
        System.out.println(getResult(arr));
    }

    public static String getResult(String[] arr) {
        HashMap<String, Integer> count = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String cur = arr[i];
            if (!count.containsKey(cur)) {
                list.add(cur);
                count.put(cur, 1);
            } else {
                count.put(cur, count.get(cur) + 1);
            }
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return count.get(o2) - count.get(o1);
            }
        });
        StringJoiner sj = new StringJoiner(",");
        for (String x : list) {
            sj.add(x);
        }
        return sj.toString();
    }
}
