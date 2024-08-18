package Aug.B18082024.Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class L04 {
    //lab231
    public static void main(String[] args) {
        List mylist=new ArrayList();
        mylist.add("T");
        mylist.add("S");
        mylist.add("P");

        System.out.println(mylist.size());
        System.out.println(mylist);
        mylist.remove("P}");
        mylist.add("PP");
        System.out.println(mylist.contains(1));

    }
}
