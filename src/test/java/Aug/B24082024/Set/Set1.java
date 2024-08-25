package Aug.B24082024.Set;

import java.util.*;

public class Set1 {
    //Lab242
    public static void main(String[] args) {
        //List - Allows Duplicate
        //Set -> Doesn't Allow Duplicate
//        Set h= new HashSet(); // Not Maintain the Order
//        h.add("Apple");
//        h.add("Orange");
//        h.add("Mango");
//        h.add("Apple"); // Not Allow Duplicate Value Update 1st
//        System.out.println(h);
//
//        Set b =new LinkedHashSet(); // Maintian The Order
//       b.add("T");
//       b.add("TP");
//       b.add("T");
//        System.out.println(b);
//        System.out.println(b.isEmpty());
//        System.out.println(b.contains("TP"));
//        System.out.println(b.size());

        //Need to Sort
        Set ts=new TreeSet();
        ts.add("A");
        ts.add("C");
        ts.add("B");
       // ts.add(null);  //Sorting With Null Not Allowed
        System.out.println(ts);

        for (Object s:ts){
            System.out.println(s);
        }
        Iterator it=ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
