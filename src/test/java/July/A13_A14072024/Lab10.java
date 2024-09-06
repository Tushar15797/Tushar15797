package July.A13_A14072024;

public class Lab10 {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;

        //int total_price=course+GST;   //Implicitly Narrowing -JVM
        int total_price=course+(int)GST;  //Explicite Narrowing - Real Time
        System.out.println(total_price);

    }
}
