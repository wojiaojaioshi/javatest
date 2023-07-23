import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class V {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();

            List<Integer> output = new ArrayList<Integer>();
            for (int num : nums) {
                output.add(num);
            }

            int n = nums.length;
            backtrack(n, output, res, 0);
            return res;
        }

        public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first)
        {
            if(n==first) {
                res.add(output);
                return;
            }
            for (int i = first; i <n ; i++) {
                Collections.swap(output, first, i);
                backtrack(n, output, res, first+1);
                Collections.swap(output, first, i);
            }
        }
    }


}
