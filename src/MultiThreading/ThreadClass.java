package MultiThreading;

public class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("inside extended thread -- " + Thread.currentThread().getName());
    }
}
