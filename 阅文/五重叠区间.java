import java.util.Arrays;
import java.util.Comparator;

public class 五重叠区间 {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            int []dp=new int[intervals.length];
            if(intervals.length==0)return 0;
            Arrays.sort(intervals, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0]-o2[0];
                }
            });
            Arrays.fill(dp,1);
            for (int i = 1; i <intervals.length ; i++) {
                for (int j = 0; j < i; j++) {
                    if(intervals[j][1]<=intervals[i][0])
                    {
                        dp[i]=Math.max(dp[i],dp[j]+1);
                    }
                }
            }
            return intervals.length-Arrays.stream(dp).max().getAsInt();
        }
    }
}
