
public class Test1{
//Inheritnace
    int a=10;
}
class T extends Test1{
   int b=20;
}
class m extends Test1{
    int c=30;
}
class r{
    public static void main(String[] args) {
        m t=new m();
        T t1=new T();
        System.out.println(t.a);
        System.out.println(t1.b);
        System.out.println(t.c);
    }
}
