package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {

    public static void main(String[] args) {

        // TreeMap<Integer,String> tm = new TreeMap<>((i,j)-> j-i);
        TreeMap<Integer,String> tm = new TreeMap<>((i,j)-> j-i);
        tm.put(23,"paras");
        tm.put(32,"bank");
        tm.put(222,"faze");
        tm.put(1,"niko");

        // from > to if descending order
        // inclusive => to include
        Map<Integer,String> temp = tm.subMap(100,true,1,false);
        temp.forEach((i,j) -> System.out.println(i + " = " + j));

//        for(Map.Entry<Integer,String> entry : tm.entrySet()){
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

  /*                       Map (interface)
             |              |               |
          HashTabel      HashMap          SortedMap (interface)
                                            |
                                          TreeMap
   */
    }

}
