package B17082024.Nested_Class;
// inner class -> We add inner class for Security Purpose / to hide the functionality
public class lab182{  // Lab202
    public static void main(String[] args) {
        Car c=new Car("Lambo");
        c.drive();
        System.out.println(c.make);


    }
}
 class Car {
    String make;
    public Car(String make){
        this.make=make;
    }
    //Method
    void drive(){
        System.out.println("You Can Drive");
    }
    class Gearbox{


    }
}
