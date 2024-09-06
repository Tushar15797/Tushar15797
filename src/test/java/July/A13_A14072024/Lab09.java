package July.A13_A14072024;

public class Lab09 {
    public static void main(String[] args) {
        long phone_no= 9970401904l;
        //short s=phone no; // Implicite Narrowing -JVM??
        short s=(short) phone_no;
        System.out.println(s);
        //JVM - GC -
    }
}
