import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 最小覆盖子串 {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
    public static String minWindow(String s, String t) {
        if(s==null||s==""||t==null||t==""||s.length()<t.length())return "";
        int []temps=new int[128];
        int []tempt=new int[128];
        for (int i = 0; i < t.length(); i++) {
            char k=t.charAt(i);
            tempt[k]++;
        }
        int j=0,len=s.length()+1,start=0,count=0;
        for (int i = 0; i < s.length(); i++) {
            char k=s.charAt(i);
            if(tempt[k]==0)continue;
            if(temps[k]<tempt[k])
            {
                count++;
            }
            temps[k]++;
            while(count==t.length())
            {
                if(i-j<len)
                {
                    len=i-j;
                    start=j;
                }

                char l=s.charAt(j);
                if(tempt[l]==0)
                {
                    j++;
                    continue;
                }
                if(temps[l]==tempt[l])
                {
                    count--;
                }
                temps[l]--;
                j++;
            }
        }

        if(len==s.length()+1)
        {
            return "";
        }
        return s.substring(start,start+len+1);
    }
}
