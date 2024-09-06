package July.A13_A14072024;

public class Lab08 {
    public static void main(String[] args) {
        //Type Casting -Source & Deastination conversion
        //Widening - Implicite ,Explicite -losssless
        //Narrowing - Implicite ,Explicite(With data type) , loss

        //Widening
        byte b = 10;
        int a = b; // VALID ->Implicite Casting -- JVM
        int a1 = (int) b; //VALID -Explicit Casting
        System.out.println(a1);

        //Narrowing
        int val=200;
        //byte b1=val; ///Invalid - Implicite Casting -JVM
        byte b1=(byte)val; //Invalid -Explicit Casting -- //Loss of data
        System.out.println(b1);
    }
}
