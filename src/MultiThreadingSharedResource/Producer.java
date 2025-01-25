package MultiThreadingSharedResource;

public class Producer implements Runnable{
    SharedResource sr;

    Producer(SharedResource sr){
        this.sr=sr;
    }
    @Override
    public void run() {
        sr.produce();
    }
}
