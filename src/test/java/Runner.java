import org.testng.annotations.Test;

import java.util.LinkedHashSet;

 interface c {
   int a=10;
 }
 interface c1 {
   int b=20;
 }
 class a2 implements c,c1 {
    int c=30;
 }
public class Runner{
    public static void main(String[] args) {
        a2 as = new a2();
        System.out.println(as.a);
        System.out.println(as.b);
        System.out.println(as.c);
    }
}