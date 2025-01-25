package Immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainImmutable {

    public static void main(String[] args) {
        // make a class immutable

        // making arrayList using asList , you cant add more elements to it, it becomes of that size
//        List<String> list = Arrays.asList("Number 1","Number2"," number 3");

        List<String> list = new ArrayList<>();
        list.add("Number 1");
        list.add("Number 2");
        list.add("Number 4");
        NormalClass nc = new NormalClass("Paras",25,1200.0);
        ImmutableClass ic = new ImmutableClass(nc,"p.bankoti@google.com","Google",list);

        // make ImmutableClass immutable

        System.out.println(ic.getNormalClass().getName());

        // changing the copied object, but it doesn't change the element of object
        ic.getNormalClass().name = "hello";

        // name attribute didn't change
        System.out.println(nc.getName());

        // trying to add elemeents to list, but not possible due to immutability.
        ic.getList().add("updated number");

        // will get list without above element added
        System.out.println(ic.getList());


        // Immutable String
        // == (for primitive datatypes it compares values, and for non-primitive datatypes it compares reference)
        int x=10,y=10;
        String s1 = new String("paras");
        String s2 = "paras";
        System.out.println((x == y ) + " == " );
    }
}
