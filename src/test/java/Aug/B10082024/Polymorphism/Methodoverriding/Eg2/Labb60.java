package Aug.B10082024.Polymorphism.Methodoverriding.Eg2;

public class Labb60 {
    public static void main(String[] args) {
        Mother m =new Mother();
        m.home();
        m.name();

        Father f=new Father();
        f.home();
        f.name();

        Father fm=new Mother();
        fm.home();
        fm.name();
    }
}
