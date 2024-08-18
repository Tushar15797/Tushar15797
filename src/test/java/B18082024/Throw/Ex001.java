package B18082024.Throw;

//Throw -- It is used to Create an Exception
//Throws -> It is used to throw the Exception
//try /catch block -> It is used to handle the exception

import java.util.Scanner;

public class Ex001 {
    //Lab223 //224
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if(x==0){
            throw new ArithmeticException("Enter non zero number");
        }

    }
}
