package Aug.B18082024.Throw;

import net.bytebuddy.implementation.bytecode.Throw;

import javax.naming.NamingException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) throws NamingException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.equals("Tushar")) {
            throw new NamingException("Not As Per Expected Name");
        } else {
            System.out.println("End of the Program");
        }
    }
}
