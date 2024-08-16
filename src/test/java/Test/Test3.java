package Test;

public class Test3 {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        System.out.println(a);
        test(b,a);  // Here are the declare variable not in Method
        System.out.println(b);
    }
    public static void test (int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
}
