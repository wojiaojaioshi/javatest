import java.util.HashSet;
import java.util.Set;

public class No48 {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        Set<Character>set=new HashSet<>();
        //j-i+1=L
        //j=L+i-1
        //右指针
        int j=0;
        for (int i = 0; i<s.length() ; i++) {
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while(j<s.length()&&!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
            }
            maxlen=Math.max(maxlen, j-i);
        }
        return maxlen;
    }
}
