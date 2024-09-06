package Aug.B24082024.ArrayList;

import java.util.ArrayList;

public class AL03 {
    public static void main(String[] args) {
        ArrayList ref=new ArrayList();
        ref.add(1);
        ref.add(2);
        ref.add(3);
        ref.add(4);
        System.out.println(ref);
        try {
            ref.remove(0);
        } catch (Exception e) {
            throw new ArithmeticException("Tushar P");
        }
        finally{
            ref.remove(Integer.valueOf(1));
            System.out.println(ref);
        }
    }
}
