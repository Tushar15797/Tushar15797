package Aug.B04082024.Hybrid_Inheritance.eg1;

public class Lab130 {
    public static void main(String[] args) {
        Son_son s= new Son_son();
        s.bike();
        s.car();
        s.home();
        s.twoWheeler();
        System.out.println("------------------------");
        Son_Daughter d= new Son_Daughter();
        d.Scooty();
        d.car();
        d.twoWheeler();
        d.home();

    }

}
