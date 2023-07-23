import java.util.HashSet;
import java.util.Set;

public class 无重复字符最长子串 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
        public static int lengthOfLongestSubstring(String s) {
            Set<Character>set=new HashSet<>();
            int setr=-1;
            int ans=0;
            for (int i = 0; i <s.length() ; i++) {
                if(i!=0)
                set.remove(s.charAt(i-1));
                while (setr+1<s.length()&&!set.contains(s.charAt(setr+1)))
                {
                    set.add(s.charAt(setr+1));
                    setr++;
                }

                ans=Math.max(ans, set.size());
            }
            return ans;


        }
}
