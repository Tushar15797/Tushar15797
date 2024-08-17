package B17082024.Exception;

import org.apache.hc.core5.http.io.SessionOutputBuffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Exception are 2 types
//1.Checked (JVM knows)   2.Unchecked -- (Runtime)
public class Exception2 {
    //lab 210
    public static void main(String[] args){

      //  1.Checked (Compile Time JVM)
        try{
           FileInputStream File =new FileInputStream("Exception/Exception1");
          }
        catch (FileNotFoundException e){
          e.printStackTrace();
        }
        System.out.println("==== Checked Exception ====");
       // 2.Unchecked -- (Runtime)
        try{
            int a=10;
            int b= a/0;   //Arithmetic Exception
            System.out.println(b);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of the Program");
    }
}
