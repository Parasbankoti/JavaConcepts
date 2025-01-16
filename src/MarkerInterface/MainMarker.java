package MarkerInterface;

public class MainMarker {

    public static void main(String[] args) {
        //  rather to mark or tag the class with a particular characteristic or capability.

        // java.io.Serializable
        //Serialization is crucial for various applications like saving application state, RMI, and caching.

        CheckClass c = new CheckClass("Paras","p.bankoti@gmail.com");
        HelperClass h = new HelperClass("Amit","amit@samsung.com");

        isMarkerInterface(c);
        isMarkerInterface(h);

    }

    public static void isMarkerInterface(Object obj) {

        if(obj instanceof Printable){
            System.out.println(obj.getClass().getSimpleName() + " is printable") ;
            // sent data to printer for printing
        }
        else{
            System.out.println(obj.getClass().getSimpleName() + " is non printable") ;
        }
    }
}
