import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class adko {
    public static void main(String[] args) {
       Callabkel callabkel=new Callabkel();
        FutureTask<Integer>result =new FutureTask<>(callabkel);
        new Thread(result).start();
        try {
            int sum= result.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class Runnablel implements Runnable{

    @Override
    public void run() {
        System.out.println("当前线程"+Thread.currentThread().getName());
    }
}
class Callabkel implements Callable{

    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
