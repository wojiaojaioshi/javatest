import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 石头剪刀布游戏 {
    // 输入输出处理
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, ArrayList<String>> map = new HashMap<>();

        while (sc.hasNext()) {
            String player = sc.next();
            char gesture = sc.next().charAt(0);

            // 如果有人不按套路出，则此局作废
            if (gesture < 'A' || gesture > 'C') {
                System.out.println("NULL");
                return;
            }

            // 统计各个手势的出派人
            map.putIfAbsent(gesture, new ArrayList<>());
            map.get(gesture).add(player);
        }

        switch (map.size()) {
            case 1:
            case 3:
                // 只有一种手势，或者三种手势都有，则平局
                System.out.println("NULL");
                break;
            case 2:
                ArrayList<String> ans;

                if (!map.containsKey('A')) {
                    // 没有A手势，只有B、C手势，则B赢
                    ans = map.get('B');
                } else if (!map.containsKey('B')) {
                    // 没有B手势，只有A、C手势，则C赢
                    ans = map.get('C');
                } else {
                    // 没有C手势，只有A、B手势，则A赢
                    ans = map.get('A');
                }

                ans.sort(String::compareTo);
                ans.forEach(System.out::println);
                break;
        }
    }
}
