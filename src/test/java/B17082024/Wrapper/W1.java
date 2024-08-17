package B17082024.Wrapper;

public class W1 {
    // Wrapper -> They Convert primitive type into object
    // Primitive -> int , Char
    // Wrapper -> Integer , Character
    //Data Structure in the Collection framework , array list and vector, Hashmap -> They Dont used Primitive data type
    //Wrapper CLass -> Web Automation
    public static void main(String[] args) {

        // Primitive to Wrapper CLass
        int a = 10;
        Integer b = a;
        //Integer.Max.Value
        System.out.println(a);
        System.out.println(b);  // extra utility are added

        //Wrapper Class to Primitive
        Integer a2=42;    // Auto Boxing - int -> Integer
        int b2= a2;       // Unboxing  - Integer -> int
        System.out.println(a2);
        System.out.println(b2);
    }
}
