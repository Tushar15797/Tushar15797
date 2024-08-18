package Aug.B17082024.Exception;

// Exception -->Anything which disrupt the normal flow of the program
//Exception are 2 types
//1.Checked (Compile Time JVM knows)   2.Unchecked -- (Runtime)
public class Exception1 {
    //Exception & Error are Handling
    // Exception Can be Handle & Error Can not be Handle
    public static void main(String[] args) {
        try {
            String ip = args[0];     // ArrayIndexOutOfBoundsException
            int a= Integer.parseInt(ip);  // NumberFormatException
            int b=100/a;                  // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
           e.printStackTrace();        // The method is useful for debugging because it helps you trace the origin of the exception and understand what went wrong in the program
        }
        System.out.println("End");
    }
}
