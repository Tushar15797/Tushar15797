package July.A20072024;

import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("No idea Which day it is");
        }
        System.out.println("-----outside the switch lopp-----");
    }
}
