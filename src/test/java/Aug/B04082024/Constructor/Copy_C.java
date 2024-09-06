package Aug.B04082024.Constructor;

public class Copy_C {
    String name; double sal;
Copy_C(){
    name="Tushar";  sal=1000;
}
Copy_C(Copy_C ref){
   name=ref.name;
   sal=ref.sal;
    System.out.println(name+" "+sal);
}
}

class B{
    public static void main(String[] args) {
        Copy_C ref1=new Copy_C();
        Copy_C ref2=new Copy_C(ref1);
    }
}
