package Aug.B10082024.Polymorphism.Methodoverriding.Eg1;

import Aug.B10082024.Polymorphism.Methodoverriding.Eg1.Dog;
import Aug.B10082024.Polymorphism.Methodoverriding.Eg1.Hound;

public class Labb10 {
    public static void main(String[] args) {
        Hound h=new Hound();
        h.bark();
        h.bike();
        h.a();

        Dog d =new Dog();
        d.bark();

        Dog d1=new Hound();
        d1.bark();  // Overridden Function  // Upcasting

    }
}
