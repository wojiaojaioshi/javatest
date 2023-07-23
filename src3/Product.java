public class Product implements Comparable{
    String color;
    Integer price;

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Product p= (Product) o;
        if(this.price>p.getPrice())
            return 1;
        if(this.price<p.getPrice())
            return -1;
        return 0;
    }
}
