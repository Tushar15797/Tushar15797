package Aug.B11082024.Interface.ex1;

public class Wagonar implements Engine{

    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    public void startEngine() {
        System.out.println("Start The Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop The Engine");
    }
}
