import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Dequetest {
    public static void main(String[] args) {
        Deque<Integer>stack=new LinkedList<>();
        stack.push(1);
        stack.addFirst(2);
        stack.add(3);
        stack.addFirst(4);
        stack.addLast(5);
        Iterator iterator=stack.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
