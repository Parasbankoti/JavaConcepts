package MultiThreadingSharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();


        // Using lambda function
         Thread producerThread = new Thread(()->{
             System.out.println("inside thread");
             sr.produce();
         });

     //   Thread producerThread = new Thread(new Producer(sr));
        Thread consumerThread = new Thread(new Consumer(sr));

        producerThread.start();
        consumerThread.start();
    }
}
