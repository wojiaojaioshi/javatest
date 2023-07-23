import java.util.HashMap;
import java.util.Map;

public class maopao {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        for (int i = 1; i <4 ; i++) {
            map.put(String.valueOf(i), "value"+String.valueOf(i));
        }
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
