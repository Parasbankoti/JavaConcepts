package MultiThreadingSharedResource;

public class SharedResource {

    boolean isAvaliable = false;

    synchronized void produce(){
        if(!isAvaliable){
            System.out.println("Produced by -- " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            isAvaliable=true;

        }

        notify();
    }

    synchronized void consume()  {

        while(!isAvaliable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("consumed by -- " + Thread.currentThread().getName());
    }
}
