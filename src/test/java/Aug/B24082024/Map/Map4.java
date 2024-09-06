package Aug.B24082024.Map;

import java.util.HashMap;
import java.util.Map;

public class Map4 {
    public static void main(String[] args) {
        //country(Key) , Population(Value)
        HashMap<String,Integer> m=new HashMap<>();
        //Insertion -- Inorder Pair
        m.put("China",100);
        m.put("India",200);
        m.put("USA",20);
        m.put("USA",50);
        System.out.println(m);
        System.out.println(m.containsKey("China"));
        System.out.println(m.containsKey("Indonesia"));
        //Search
        if(m.containsKey("India")){
            System.out.println("Key is Present in Map");
        }else {
            System.out.println("Key is not present in map");
        }
    }
}
