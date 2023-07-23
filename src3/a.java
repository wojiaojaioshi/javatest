import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class a {
    public List<Product> filterProductByPredicate(List<Product> list,MyPredicate<Product> mp){
        List<Product> prods = new ArrayList<>();
        for (Product prod : list){
            if (mp.test(prod)){
                prods.add(prod);
            }
        }
        return prods;
    }
    public void t1()
    {
        List<Product>products=new ArrayList<>();
        List<Product>list=filterProductByPredicate(products,(p)->p.getPrice()<9000);
    }
}
