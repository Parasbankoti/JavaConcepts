package MultiThreadingSharedResource;

public class Consumer implements Runnable{
    SharedResource sr;

    Consumer(SharedResource sr){
        this.sr=sr;
    }

    @Override
    public void run() {
        System.out.println("inside consumer -- " + Thread.currentThread().getName());
        sr.consume();
    }
}
