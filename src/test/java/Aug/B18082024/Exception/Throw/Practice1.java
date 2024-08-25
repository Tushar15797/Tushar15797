package Aug.B18082024.Exception.Throw;

import org.apache.xmlbeans.impl.store.Saaj;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        if(a==0){
            throw new ArithmeticException("Input Can not be Zero");
        }else {
            System.out.println("Input is OKKK");
        }
    }
}
