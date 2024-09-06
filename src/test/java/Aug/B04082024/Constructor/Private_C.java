package Aug.B04082024.Constructor;

public class Private_C {
    int a; float n;
    //Private Constructor not Used Outside the Class
   private Private_C() {
        a=100;
        n=67;
    }

    public static void main(String[] args) {
        Private_C c=new Private_C();
        System.out.println(c.a+"----"+c.n);
    }
}
