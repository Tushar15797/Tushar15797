package A27072024;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        //lan 142
        int[] ages= new int[5];
        Scanner  sc=new Scanner(System.in);
        ages[4]=sc.nextInt();
        ages[3]=78;
        ages[0]=10;
        System.out.println(ages[3]);  // assign values
        System.out.println(ages[2]);  // Default values
        System.out.println(ages[4]);  // Assign in Scanner Class
        //System.out.println(ages[5]);  // Error Will get

        boolean[] is_study ={true,false,true};
        System.out.println(is_study[1]);

        for(int i=0; i<=ages[4];i++){
            System.out.println(i +" --> " + ages[4]);
        }

    }
}