import java.util.*;

public class 万能字符单词拼写掌握的单词个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        List<Map<Character, Integer>> mapList = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < str[i].length(); j++) {
                char c = str[i].charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            mapList.add(map);
        }
        String k = sc.next();
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < k.length(); i++) {
            char c = k.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            Map<Character, Integer> map = mapList.get(i);
            int wenhao = charMap.getOrDefault('?',0);
            boolean flag = true;
            for (Character x : map.keySet()) {
                int lnums = charMap.getOrDefault(x, 0), rnums = map.getOrDefault(x, 0);
                if (lnums >= rnums) {
                    continue;
                } else if (lnums < rnums) {
                    if (wenhao + lnums >= rnums) {
                        wenhao -= (rnums - lnums);
                    } else {
                        flag = false;
                    }
                }
            }
            if (flag) ans++;
        }
        System.out.println(ans);
    }
}
