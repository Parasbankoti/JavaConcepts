import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        // predicate : Predicate<T>  boolean test(T)
        Predicate<Integer> p = num -> num%2 == 0;
        System.out.println(p.test(10));

        // consumer : Consumer<T>  void accept(T t)
        Consumer<String> c = (String s)-> System.out.println(s);
        c.accept("paras");

        // supplier : Supplier<T>   T get()
        Random r = new Random();
        Supplier<Integer> s = () -> r.nextInt(100);
        System.out.println(s.get());

        // function : Function<T,R> R apply(T t)
        Function<String,Integer> f = (str) -> str.length();
        System.out.println(f.apply("paras Length"));
    }



}
