package B17082024.Wrapper;

public class W3 {
    public static void main(String[] args) {
        Double d=3.14;   // Wrapper Class  --Stored in Heap Area
        double val=d.doubleValue();  // Normal Primitive Data type  --Stored in Continous Memory
        System.out.println(d);
        System.out.println(val);
    }
}
