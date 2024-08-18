package Aug.B18082024.Collection_Framework.List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class L04 {
    //lab231
    public static void main(String[] args) {
        List mylist=new ArrayList();
        mylist.add("T");
        mylist.add("S");
        mylist.add("P");
        mylist.add("P"); //Duplicate

        System.out.println(mylist.size());
        System.out.println(mylist);
        mylist.remove("P");  // Remove the first occurence
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());

        mylist.add("TUSHAR");
        mylist.add("ANKIT");
        mylist.add("POOJA");
        mylist.add("YOGESH");
        mylist.add("TUSHAR");
        System.out.println(mylist.contains(1));
        System.out.println(mylist);
        mylist.add("PATIL");
        System.out.println(mylist);
        mylist.set(1,"RAJ WAGH");  //Replace
        System.out.println(mylist);

        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);
        System.out.println("----------------------------");

        //How to Print
        for(int i=0; i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        System.out.println("---------------------");

        //Enhanced For Loop

        for(Object o: mylist){
            System.out.println(o);
        }
    }
}
