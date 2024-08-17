package B17082024.SIB_IIB;

public class Lab180 {
    public static void main(String[] args) {
        A a =new A();
        A a1 =new A();
        a.age=12;
        System.out.println(A.discount);
        a.m2();
        A.m1();  //Because of Static with help of Class name
    }
}
class A{
    int age=10;
    static int discount=199;
    static {
        System.out.println("SIB-A");   // Static Intialization Block
    }
    {
        System.out.println("IIB");     // Instance Intialization Block
    }
    static void m1(){
        System.out.println("m1");
        System.out.println(discount);
    }
    void m2(){
        System.out.println("m2");
        System.out.println(discount);
    }
}
