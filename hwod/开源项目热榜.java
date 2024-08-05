import java.util.*;

public class 开源项目热榜 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wealth = new int[5];
        for (int i = 0; i < wealth.length; i++) {
            wealth[i]=sc.nextInt();
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            String[] str = sc.nextLine().split(" ");
            int hot = 0;
            for (int j = 1; j < str.length; j++) {
                hot += Integer.parseInt(str[j]) * wealth[j - 1];
            }
            map.put(str[0], hot);
        }
        List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue()!=o2.getValue()){
                    return o2.getValue()-o1.getValue();
                }else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey());
        }
    }
}
