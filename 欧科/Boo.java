import java.util.HashMap;
import java.util.Map;

public class Boo {
    public boolean wordPattern (String pattern, String str) {
        // write code here
        char a[]=pattern.toCharArray();
        String b[]=str.split(" ");
        Map<Character,String >map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i]))
            {
                if(!map.get(a[i]).equals(b[i]))
                {
                    return false;
                }
            }else
            {
                map.put(a[i],b[i]);
            }
        }
        return true;
    }
}
