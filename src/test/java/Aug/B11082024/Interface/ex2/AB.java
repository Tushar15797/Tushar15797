package Aug.B11082024.Interface.ex2;

interface A {
     void a();
}

interface B{
    void b();
}

public class AB implements A,B{
    public static void main(String[] args) {
        AB ref = new AB();
        ref.a();
        ref.b();
    }

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }
}
