package Aug.B11082024.Interface.Multiple_Inheritance.Lab2;

public class Bank implements IDFC_Bank,IDBI_Bank {

    @Override
    public void name() {
        System.out.println("Bank");
    }

    @Override
    public void loc() {
        System.out.println("Mumbai");
    }

    @Override
    public void branch() {
        System.out.println("Thane");
    }
}
