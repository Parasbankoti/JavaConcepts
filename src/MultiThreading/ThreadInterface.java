package MultiThreading;

public class ThreadInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("created thread from Runnable interface -- " + Thread.currentThread().getName());
    }
}
