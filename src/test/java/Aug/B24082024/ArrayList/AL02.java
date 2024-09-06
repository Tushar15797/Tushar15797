package Aug.B24082024.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL02 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(40));
        System.out.println(list);

        System.out.println(list.contains(10));
        list.clear();
        System.out.println(list);
    }
}
