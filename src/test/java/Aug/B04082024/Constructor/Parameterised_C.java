package Aug.B04082024.Constructor;
public class Parameterised_C {
    // Constructor Overloading
    int a; double sal;
    Parameterised_C(){
        System.out.println("Parameterised Constructor");
    }
    Parameterised_C(int a){
        System.out.println(a);
    }
    Parameterised_C(double sal){
        System.out.println(sal);
    }
    void q(){
        System.out.println("Method Execute");
    }
}
class ac{
    public static void main(String[] args) {
        Parameterised_C ref=new Parameterised_C();
        Parameterised_C ref1=new Parameterised_C(10);
        Parameterised_C ref2=new Parameterised_C(100.00);
        ref2.q();
    }
}
