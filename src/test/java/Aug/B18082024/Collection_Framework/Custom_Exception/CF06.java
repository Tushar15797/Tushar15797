package Aug.B18082024.Collection_Framework.Custom_Exception;

import java.util.Scanner;

public class CF06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.next();
        if(name.equalsIgnoreCase("Tushar")){
            try{
                throw new Exception("Not Allowed !!!");
            }
            catch (Exception e){
                System.out.println("Exception !!!");
            }
        }else {
            System.out.println("Allowed !!!");
        }
    }
}
