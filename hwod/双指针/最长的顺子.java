package 双指针;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 最长的顺子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("-");
        String[] out = sc.nextLine().split("-");
        ArrayList<String> remain = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(out[j])) {
                continue;
            } else {
                remain.add(arr[i]);
            }
            j++;
        }
        int maxlen = 5;
        Map<String, Integer> value = new HashMap<>();
        value.put("3", 3);
        value.put("4", 4);
        value.put("5", 5);
        value.put("6", 6);
        value.put("7", 7);
        value.put("8", 8);
        value.put("9", 9);
        value.put("10", 10);
        value.put("J", 11);
        value.put("Q", 12);
        value.put("K", 13);
        value.put("A", 14);
        ArrayList<String> ans, res;
        for (int i = 0; i < remain.size(); i++) {
            ans = new ArrayList<>();
            int len = 1;
            for (int k = 0; k < remain.size(); k++) {
                if (value.get(remain.get(i + k)).equals((value.get((remain.get(i + k + 1)) + 1)))) {
                    ans.add(remain.get(i + k));
                    len++;
                    continue;
                } else {
                    if (len > 5) {
                        if (len > maxlen) {
                            maxlen = len;
                            res = ans;
                        }
                    }
                    break;
                }
            }
        }
    }
}
