import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class U {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
            list.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i));
            System.out.print(linkedList.get(i));
        }
        System.out.println();

        Iterator iterator=linkedList.listIterator(0);
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
        }
    }
}
