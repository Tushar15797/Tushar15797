package B11082024.Interface.Multiple_Inheritance.Lab1;

public class Son implements Father, Mother {

    @Override
    public void loan() {            //common Methods
        System.out.println("Only one Function");
    }

    @Override
    public void loan(String b, String c) {
        System.out.println("String b, String C");
    }

    @Override
    public void loan(String a) {
        System.out.println("String a");
    }

    @Override
    public void home() {
        System.out.println("Home");
    }
}
