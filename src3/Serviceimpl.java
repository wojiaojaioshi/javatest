public class Serviceimpl {


    Service<Product> serviceimpl=(p)->{
        System.out.println(p);
    };

    public void setServiceimpl(Service<Product> serviceimpl) {
        this.serviceimpl = serviceimpl;
    }
}
