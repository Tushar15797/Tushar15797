package Aug.B04082024.Access_Modifiers.Default;

import Aug.B04082024.Access_Modifiers.Protected.Protected;

public class Criminal {
    public static void main(String[] args) {

        Cop c = new Cop(100);
        System.out.println(c.gun);
        c.canIShoot();

        Protected p= new Protected(1);
        //p.can      not able to access different class
    }
}
