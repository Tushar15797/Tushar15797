package July.A20072024;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Score");
        int user_input =sc.nextInt();
        if(user_input>=90 && user_input <=100){
            System.out.println("A");
        }
        else if (user_input>=80 && user_input<90){
            System.out.println("B");
        } else if (user_input>=70 && user_input<80) {
            System.out.println("C");
        }else if (user_input>=35 && user_input<70){
            System.out.println("D");
        }else {
            System.out.println("Fail");
        }
    }
}
