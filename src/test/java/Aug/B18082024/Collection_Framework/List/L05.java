package Aug.B18082024.Collection_Framework.List;

import java.util.*;

public class L05 {
    //lab232
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(90);
        marks.add(91);
        marks.add(80);
        marks.add(55);
        marks.add(77);
        System.out.println(marks);

        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);
    }
}
