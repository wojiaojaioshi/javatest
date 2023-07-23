import java.util.concurrent.ThreadPoolExecutor;

public class jkj {
    static int i=0;
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("匿名代码快");
    }
    jkj()
    {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        System.out.println(i);
        new jkj();

    }

}
