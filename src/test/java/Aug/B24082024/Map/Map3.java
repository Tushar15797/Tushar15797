package Aug.B24082024.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Map3 {
    //Not Used in Automation
    //Lab 246
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1= new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"Two");
        ht1.put(3,"Three");

        Enumeration<Integer> e=ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(ht1.get(e.nextElement()));
        }

    }
}
