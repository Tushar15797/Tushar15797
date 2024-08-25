package Aug.B24082024.Map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    //lab245
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",33);
        map.put("id4",10);
        map.put("id5",null);
        map.put(null,100);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));

        System.out.println("----------");

        //How to iterate over all the elements in the Map
        for(Map.Entry<String,Integer>item: map.entrySet()){
            System.out.println(item.getKey()+"->"+item.getValue());
        }
    }
}
