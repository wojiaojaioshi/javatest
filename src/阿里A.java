import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;

public class 阿里A {
    public static void main(String[] args) {
        Map<Character,Integer>map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        map.put('1', 1);map.put('8', 1);
        map.put('2', 1);map.put('9', 2);
        map.put('3', 2);map.put('a', 2);
        map.put('4', 1);map.put('b', 3);
        map.put('5', 2);map.put('c', 2);
        map.put('6', 2);map.put('d', 3);
        map.put('7', 3);map.put('e', 3);map.put('f', 4);
        String  str=sc.next();
        int sum=0;
        for (int i = 2; i <str.length() ; i++) {
            if(map.containsKey(str.charAt(i)))
            sum+=map.get(str.charAt(i));
        }
        System.out.println(sum);
    }
}
