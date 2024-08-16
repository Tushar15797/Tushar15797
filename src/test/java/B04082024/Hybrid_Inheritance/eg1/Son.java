package B04082024.Hybrid_Inheritance.eg1;

public class Son implements Mother,Father {
    void twoWheeler(){
        System.out.println("Splender");
    }

    @Override
    public void car() {
        System.out.println("Swift");
    }

    @Override
    public void home() {
        System.out.println("2 BHK");
    }
}
