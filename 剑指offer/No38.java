import java.util.*;

public class No38 {
        List<String> res = new LinkedList<>();
        char[] c;
        public String[] permutation(String s) {
            //回溯做数组交换
            c = s.toCharArray();
            dfs(0);
            return res.toArray(new String[res.size()]);
        }
        void dfs(int x) {
            if(x==c.length-1)
            {
                res.add(String.valueOf(c));
                return;
            }
            //一个Set判是否重复
            Set<Character>set=new HashSet<>();

            for(int i=x+1;i<c.length;i++)
            {
                if(set.contains(c[i]))continue;
                set.add(c[i]);
                swap(i,x);
                dfs(x+1);
                swap(i, x);
            }
        }
        void swap(int a, int b) {
            char tmp = c[a];
            c[a] = c[b];
            c[b] = tmp;
        }
}
