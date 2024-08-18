package Aug.B18082024.Collection_Framework.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class V01 {
    //lab235
    public static void main(String[] args) {
        List myList1= new ArrayList(); //FR - CO
        myList1.add("A");
        myList1.add("B");
        myList1.add("C");
        myList1.add("D");
        myList1.add("E");
        System.out.println(myList1);

        Vector v=new Vector();
        v.add("AB");
        v.add("AC");
        v.add("AD");
        v.add("AE");
        v.add("AF");
        System.out.println(v);

        //Vector
        //Only Problem with Vector it is a Thread safe, Synchronized
        //it will be time consuming
        //one by one --> Usage
        //Slower

    }
}
