package Aug.B11082024.StaticKeyword;

import java.sql.SQLOutput;

public class Labb152 {
    //Static - Block , Method (Data member), Function, Class
    public static void main(String[] args) {
        ATB a= new ATB();
        a.qw();
        ATB.as();
    }
}

class ATB{
    {
        System.out.println("IIB");
        System.out.println("Reading The Data From CSV File");
    }
    static {
        System.out.println("Load the Class ?, I Will Execute First");
    }
    void qw(){
        System.out.println("2nd");
    }
    static void as(){
        System.out.println("Static Method");
    }
    static {
        System.out.println("Load the class ?, I will Execute Second");
    }
}
