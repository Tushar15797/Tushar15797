package Aug.B18082024.Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] a1) {
       /*
        //Array
        int[] a = new int[10];
        a[0] = 7;
        System.out.println(a[0]);
*/
        //List - Interface
        //Array List
        List<String> List = new ArrayList<>();
        List.add("10");
        List.add("2");
        System.out.println(List);
       // System.out.println(List.get(0));
        List.remove("10");
        List.add("abc");
        System.out.println(List);
        System.out.println(List.get(0));
/*
        //LinkList
        List<String> b = new LinkedList<>();
        b.add("a");
        b.add("b");
        System.out.println(b);
        System.out.println(b.get(0));
        b.remove("a");
        System.out.println(b);
        b.add("Z");
        System.out.println(b);

*/
    }
}
