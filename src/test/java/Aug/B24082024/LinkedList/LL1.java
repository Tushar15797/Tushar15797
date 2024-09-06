package Aug.B24082024.LinkedList;


import java.util.ArrayList;
import java.util.LinkedList;

public class LL1 {
    //lab236
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");
        l.add(1);
        l.add('d');
        l.add(4.51);
        l.add(2.3f);
        System.out.println(l);

        ArrayList a=new ArrayList();
        a.add("Node 1");
        a.add("Node 2");
        a.add("Node 3");
        a.add('a');
        a.add(4.52);
        a.add(2.5f);
        a.add(1);
        a.remove(1);
        System.out.println(a);
        System.out.println(a.get(2));
    }
}
