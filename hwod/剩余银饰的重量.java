import java.util.*;

public class 剩余银饰的重量 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        while (list.size() >= 3) {
            Collections.sort(list, (a, b) -> b - a);
            int x = list.get(0);
            int y = list.get(1);
            int z = list.get(2);
            list.remove(0);
            list.remove(0);
            list.remove(0);
            if (x != y && y != z) {
                int remain = Math.abs(Math.abs(x - y) - Math.abs(y - z));
                if(remain!=0)
                list.add(remain);
            } else {
                int remain = Math.abs(x - y) + Math.abs(y - z);
                if (remain != 0) {
                    list.add(remain);
                }
            }
        }
        if (list.size() == 2) {
            System.out.println(list.stream().reduce(Integer::max));
        } else if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(0);
        }
    }
}
