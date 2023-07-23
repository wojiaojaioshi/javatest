import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Y {
    public static void main(String[] args) {
        System.out.println(isValid("{}{]{}{}{}{}{}{}"));
    }
    public static boolean isValid(String s) {
        if(s.length()%2==1)
        return false;
        Map<Character,Character >map=new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Deque<Character>stack=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char str=s.charAt(i);
            if(map.containsKey(str))
            {
                if(stack.isEmpty()||stack.peek()!=map.get(str))
                {
                    return false;
                }
                stack.pop();
            }
            else {
                stack.push(str);
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else return false;
    }
}
