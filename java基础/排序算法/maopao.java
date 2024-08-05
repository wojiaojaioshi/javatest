//import java.util.*;
//import java.util.function.BiConsumer;
//
//class S{
//    private int anInt;
//}
//public class maopao {
//    public maopao() {
//
//    }
//
//    public static void main(String[] args) {
//        Map<String,Object>map=new HashMap<>();
//        map.put("key1", "value1");
//        map.put("key2", "value2");
//        map.put("key3", "value3");
//        map.put("key4", "value4");
//
//        for (String key:map.keySet()) {
//            System.out.println(key+":"+map.get(key));
//        }
//        for (Map.Entry<String,Object> entry:map.entrySet()) {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }
//        map.forEach(new BiConsumer<String, Object>() {
//            @Override
//            public void accept(String key, Object value) {
//                System.out.println(key+":"+value);
//            }
//        });
//        map.forEach((key,value)->{
//            System.out.println(key+":"+value);
//        });
//        Iterator<Map.Entry<String, Object>> iterator=map.entrySet().iterator();
//        while ()
//    }
//}
