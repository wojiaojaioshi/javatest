import java.util.*;

public class LRU缓存机制 {
    private int len;
    Map<String,Integer >map;
    List<Integer>list=new ArrayList<>();
    public void LRUCache(int capacity) {
        map=new HashMap<>();
        len=capacity;
    }

    public int get(int key) {
        if(map.get(String.valueOf(key))==null)return  -1;
        else
        {
            int flat=0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==map.get(key))flat=i;
            }
            if(list.size()>0)
            {
                list.remove(flat);
                list.add(key);
            }
            return map.get(String.valueOf(key));
        }
    }

    public void put(int key, int value) {
        if(list.size()==len)
        {
            int ko= (int) list.remove(0);
            map.remove(String.valueOf(ko));
        }
        map.put(String.valueOf(key), value);
    }
}
