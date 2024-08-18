package Aug.B18082024.Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class L01 {
    public static void main(String[] args) {
        //lab228
        //Collection Framework
        //Collection - Interface
        //Collection(I) ->List (I)
        //LIST(I) -> ArrayList, LinkedList,Vector,Stack  (e.g Mark List, Shopping List)
        //collection mylist3=new ArrayList(); //Dynamic Dispatch
        //List mylist= new ArrayList(); //Dynamic Dispatch

        ArrayList mylist2=new ArrayList();
        mylist2.add("T");
        mylist2.add("U");
        mylist2.add("S");
        mylist2.add("H");
        mylist2.add("A");
        mylist2.add("R");
        mylist2.add(123);
        mylist2.add(true);

        System.out.println(mylist2);
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("U"));
        System.out.println(mylist2.contains("SH"));
        System.out.println(mylist2.contains(123));

        String s1= (String)mylist2.get(1);  // index Start With 0
        System.out.println(s1);
        }
}
