package Aug.B18082024.Collection_Framework.Custom_Exception;

import java.util.Scanner;

public class CF07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        try {
            if (x == 0) {
                throw new ArithmeticException("Enter Non Zero Number");
            }
            int a = 10 / x;
            System.out.println(a);
        }catch (ArithmeticException e){
            throw new RuntimeException(e);
        }
    }
}
