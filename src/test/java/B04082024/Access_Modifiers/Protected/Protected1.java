package B04082024.Access_Modifiers.Protected;

public class Protected1 {

    // Protected allow in Same Package Not in Different Package
    public static void main(String[] args) {
        Protected p=new Protected(2);
        p.canIShoot();
    }
}
