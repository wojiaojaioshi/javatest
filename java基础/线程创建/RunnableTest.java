import java.util.concurrent.ThreadLocalRandom;

public class RunnableTest {
    public static void main(String[] args) {
        Runnablel r=new Runnablel();
        Thread thread=new Thread(r);
        thread.start();
        System.out.println("主线程:"+Thread.currentThread().getName());
    }
}
class Runnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("当前线程:"+Thread.currentThread().getName());
    }
}
