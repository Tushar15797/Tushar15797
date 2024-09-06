package Aug.B24082024.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Set3 {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(1);

        Iterator it=h.iterator();

        while(it.hasNext()){
            System.out.println(it.hasNext());
        }

    }
}
