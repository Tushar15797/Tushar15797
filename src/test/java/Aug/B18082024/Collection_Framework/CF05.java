package Aug.B18082024.Collection_Framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CF05 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a=10/0; //un -ar
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e1) {
            throw new RuntimeException(e1);
        }finally {
            System.out.println("FF");
        }
        FileReader f= new FileReader(new File("/users/promode/downloads"));
    }
}
