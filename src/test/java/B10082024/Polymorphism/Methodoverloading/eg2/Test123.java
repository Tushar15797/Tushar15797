package B10082024.Polymorphism.Methodoverloading.eg2;
public class Test123 {
    public static void main(String[] args) {
        int c = add(10, 6);
        System.out.println(c);
        int c1 = add(10, 6, 2);
        System.out.println(c1);
        int c2 = add(10, 6, 2, 1);
        System.out.println(c2);
    }

    public static int add(int a, int b) {
        System.out.println("2 formal argument");
        return a+b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("3 formal argument");
        return a+b+c;
    }
    public static int add(int a,int b,int c,int d) {
        System.out.println("4 formal argument");
        return a+b+c+d;
    }
}