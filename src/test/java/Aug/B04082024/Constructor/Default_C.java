package Aug.B04082024.Constructor;

public class Default_C {
        int a;  String name;
        // Default Constructor
//    DC1(){
//        //a=0; name=null // Default Values
//        System.out.println(a+" "+name);
//    }
        void a(){
            System.out.println(a+"  "+name);
            System.out.println("a Method is run");
        }
    }
    class ab{
        public static void main(String[] args) {
            Default_C ref=new Default_C();
            ref.a();
        }
    }

