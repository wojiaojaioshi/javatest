import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class b {
    public static void main(String[] args) {
        TreeSet<Product> treeSet=new TreeSet<>();

        for (int i = 10; i > 0; i--) {
            Product p=new Product();
            p.setPrice(i);
            treeSet.add(p);
        }
        for (Product x:treeSet) {
            System.out.println(x.getPrice());
        }
    }
    public static Integer cal(int x, Function<Integer, Integer>arg)
    {
        return arg.apply(x);
    }
}
