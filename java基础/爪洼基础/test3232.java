import java.util.*;

public class test3232 {


    public static void main(String[] args) {
        String a="s";
        a.hashCode();
        Object b="s";
        b.hashCode();
        Integer c=1;
        c.hashCode();
        a.equals("1");
        Set<Integer>set=new HashSet<>();
        set.add(1);
        ArrayList<Integer>list=new ArrayList<>();
        Vector<Integer>vector=new Vector<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        ListIterator listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }
}
