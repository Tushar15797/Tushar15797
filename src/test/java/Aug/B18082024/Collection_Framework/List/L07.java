package Aug.B18082024.Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L07 {
    //lab234
    //To Print Array list into 3 Different Types
    public static void main(String[] args) {
        List<String> mylist=new ArrayList();
        mylist.add("A");
        mylist.add("B");
        mylist.add("c");
        mylist.add("D");
        System.out.println("---To Print ArrayList-1 ---");

        for (String str : mylist){
            System.out.println(str);
        }
        System.out.println("---To Print ArrayList-2 ---");

        for (int i=0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
        System.out.println("---To print ArrayLsit3 ---");

        //Iterator
        Iterator<String> its =mylist.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }
    }
}
