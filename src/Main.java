import java.util.concurrent.*;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

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

        ThreadPoolExecutor th2 = new ThreadPoolExecutor(2,3,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),new ThreafFac(), new CustomThreadPoolFullException() );

        // Future is used for storing the data returned by thread after executing the task
        Future<String> future = th2.submit(()->{
            // do some work
            return "paras";
        });

        // to get this task we use future.get()
        // but this stops the calling thread from executing, in this case main method is stopped until future finishes executing

        // to stop the blocking issue in java 9 completableFuture was presented
        // it provide various upgrades over future like :
        // exception handling
        // chaining futures
        // main methids used are : thenApply, thenCompose,
        // thenApplyAsync is used if we want other thread to execute the work after then apply call

        // predicate : Predicate<T>  boolean






        CompletableFuture<String> futureString = CompletableFuture.supplyAsync(()->{
            return "Paras";
        }).thenApply((s) -> {
            s+= " is a good boy";
            return s;
        }).thenApply((s) ->{
            s= s.toUpperCase();
            return s;
        });

        System.out.println(futureString.get());

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