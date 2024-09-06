package Aug.B24082024.Set;

import java.util.HashSet;

public class Set2 {
    public static void main(String[] args) {
//Creating
        HashSet<Integer> h=new HashSet<>();
        //Insert
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(1);
        System.out.println(h);
        System.out.println(h.size());
        //Search  -- Contain
        if(h.contains(1)){
            System.out.println("set contains 1");
        }
        if(!h.contains(6)){
            System.out.println("Does not contain");
        }
        h.remove(1);
        System.out.println(h);
        System.out.println(h.size());
    }
}
