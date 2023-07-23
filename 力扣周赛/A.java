import sun.font.DelegatingShape;

import java.util.HashMap;
import java.util.Map;

class sadsa {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));

    }
    public static String decodeMessage(String key, String message) {
        key=key.replace(" ", "");
        Map<Character,Character >map=new HashMap<>();
        int mapLenth=0;
        for(int i=0;i<key.length();i++)
        {
            if(!map.containsKey(key.charAt(i)))
            {
                char temp= (char) ('a'+mapLenth);
                map.put(key.charAt(i),temp);
                mapLenth++;
                if(mapLenth==26)break;
            }
            else continue;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char a=message.charAt(i);
            if(a==' ')stringBuilder.append(" ");
            else
            stringBuilder.append(map.get(a));
        }
        return stringBuilder.toString();
    }
}
