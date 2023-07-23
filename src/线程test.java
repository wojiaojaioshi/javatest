public class 线程test {

    static class go implements Runnable{
        public void go()
        {
            System.out.println("start");
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        go go=new go();
        Thread thread=new Thread(go);
        thread.start();
        thread.join();
        System.out.println("主线程");
    }
}
