import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 3, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),new ThreafFac(), new CustomThreadPoolFullException() );


        for (int i=0;i<10;i++){

            threadPool.submit(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " " );
            });

        }
        threadPool.shutdown();

    }
}


class ThreafFac implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
//        th.setName("TaskThreads");
        th.setPriority(Thread.MAX_PRIORITY);

        return th;
    }
}

class CustomThreadPoolFullException implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Thread pool exedcutor full, cant do this task ");
    }
}