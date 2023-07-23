import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        Callablel c=new Callablel();
        FutureTask<Integer>result=new FutureTask<>(c);
        new Thread(result).start();

        try{
            int sum=result.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class Callablel implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <=100; i++) {
            sum+=i ;
        }
        return sum;
    }
}
