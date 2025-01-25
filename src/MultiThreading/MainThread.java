package MultiThreading;

public class MainThread {

    public static void main(String[] args) {
        Thread th = new ThreadClass();
        System.out.println("Main thread -- "+  Thread.currentThread().getName());
        th.start();

        ThreadInterface threadInterface = new ThreadInterface();
        Thread thread = new Thread(threadInterface);
        thread.start();

        Thread lambdaThread = new Thread(()->{
            System.out.println("From lambda Thread -- " + Thread.currentThread().getName());
        });
        lambdaThread.start();
    }
}
