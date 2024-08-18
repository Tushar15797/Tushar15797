package Aug.B17082024.Anonymous_Class;

public class Lab183 {
    //lab203
    //Anonymous Class
    public static void main(String[] args) {
        ABC a3 = new ABC() {
            @Override
            public void a1() {
                System.out.println("a1");
            }

            @Override
            public void a2() {
                System.out.println("a2");
            }
        };
        CBA ref = new CBA() {
            void m3() {
                System.out.println("m3");
            }
        };
    }
}
interface ABC{
    void a1();
    void  a2();
}
abstract class CBA{
    abstract void m3();
}
