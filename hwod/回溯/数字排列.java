package 回溯;

import java.util.*;

public class 数字排列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(getResult(nums));
    }

    static int getResult(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = Integer.MIN_VALUE;
        for (int num : nums) {
            set.add(num);
            n = Math.max(n, num);
        }
        if (set.size() != 4) {
            return -1;
        }
        if (set.contains(2) && set.contains(5)) return -1;
        if (set.contains(6) && set.contains(9)) return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 5);
        map.put(5, 2);
        map.put(6, 9);
        map.put(9, 6);
        ArrayList<Integer> res = new ArrayList<>();
        dfs(nums, new boolean[nums.length], "", map, res);
        res.sort((a, b) -> {
            return a - b;
        });
        return res.get(n - 1);
    }

    static void dfs(int[] nums, boolean vis[], String path, HashMap<Integer, Integer> map, ArrayList<Integer> res) {
        if (!path.isEmpty()) {
            res.add(Integer.parseInt(path));
        }
        if (path.length() == nums.length) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[i]) continue;
            vis[i] = true;
            dfs(nums, vis, path + nums[i], map, res);
            if (map.containsKey(nums[i])) {
                dfs(nums, vis, path + map.get(nums[i]), map, res);
            }
            vis[i] = false;
        }
    }
}
