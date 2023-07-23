import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class myThread  extends Thread{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callabletest callabletest=new callabletest();
        FutureTask<Integer> result=new FutureTask<>(callabletest);
        new Thread(result).start();
        int sum=result.get();
        System.out.println(sum);
    }
}
class callabletest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
