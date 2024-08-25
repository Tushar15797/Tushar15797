package Aug.B24082024.Map;

import java.util.*;
//Iterator later
public class Map1 {
    public static void main(String[] args) {
        //Map - Key and Value pair
        //Most Used - Hash Map

        Map m=new HashMap();
        m.put("name","Tushar");
        m.put("ID","15");
        m.put("Phone No","9970401904");
        System.out.println(m);

        Map m1=new WeakHashMap();
        m1.put("name","Tushar");
        m1.put("ID","15");
        m1.put("Phone No","9970401904");
        System.out.println(m1);

        Map m2=new LinkedHashMap();
        m2.put("name","Tushar");
        m2.put("ID","15");
        m2.put("Phone No","9970401904");
        System.out.println(m2);

        Map m3=new TreeMap();
        m3.put("name","Tushar");
        m3.put("ID","15");
        m3.put("Phone No","9970401904");
        System.out.println(m3);

    }
}
