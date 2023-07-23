import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class 线程池 {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        ExecutorService executorService2=Executors.newCachedThreadPool();

//        for (int i = 1; i <=10; i++) {
//            final int index=i;
//            executorService.execute(()->{
//                try {
//                    Thread.sleep(1000);
//
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            executorService2.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                         int index=i;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+" "+index);
                    }
                }
            });


//            });
        }

}

