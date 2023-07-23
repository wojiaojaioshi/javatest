public class No45 {
        public String minNumber(int[] nums) {
            String[] strs = new String[nums.length];
            for(int i = 0; i < nums.length; i++)
                strs[i] = String.valueOf(nums[i]);
            quickSort(strs, 0, strs.length - 1);
            StringBuilder res = new StringBuilder();
            for(String s : strs)
                res.append(s);
            return res.toString();
        }
        void quickSort(String[] strs, int l, int r) {
            if(l >= r) return;
            int i = l, j = r;
            //tmp就是左边界的值
            String tmp = strs[i];
            while(i < j) {
                //从右边找比基准值小的数
                while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
                //从左边找比基准值大的数
                while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
                //i和j交换位置，tmp记录比基准值大的值
                tmp = strs[i];
                strs[i] = strs[j];
                strs[j] = tmp;
            }
            //出循环的条件是i==j，tmp为大的值
            strs[i] = strs[l];
            //最后面
            strs[l] = tmp;
            //最后i=j，分半
            quickSort(strs, l, i - 1);
            quickSort(strs, i + 1, r);
        }
}
