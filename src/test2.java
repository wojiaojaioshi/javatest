import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Map<String ,String >map=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
//        Collection<String >collection=map.values();
//        for (String i:collection) {
//            System.out.println(i);
//        }
        Set<Map.Entry<String, String>> set=map.entrySet();
            System.out.println(set);
//        Set<String >set1=map.keySet();
//        for (String i:set1) {
//            System.out.println(i);
//        }
//        Iterator iterator=map.entrySet().iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator);
//        }
    }
}
