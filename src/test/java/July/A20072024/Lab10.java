package July.A20072024;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String browserName=sc.next();
    browserName =browserName.toLowerCase();

    switch(browserName){
        case "chrome":
        {
            System.out.println("chrome browser");
        }
        case "edge":
        {
            System.out.println("Edge browser");
        }
    }
}}
