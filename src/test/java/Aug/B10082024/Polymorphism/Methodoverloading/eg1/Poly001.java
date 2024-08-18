package Aug.B10082024.Polymorphism.Methodoverloading.eg1;

public class Poly001 {

    // Method Overloading -- A Class having more than one method with same name but different formal argument is called method Overloading
    //mathoperation  lab181
    public static void main(String[] args) {
        Poly002 a1= new Poly002();
        int result=a1.add(1,2);
        double result1=a1.add(1.0,2.1,3);
        String result2=a1.add("Tushar","  Patil");
        //String result3=a1.add(1,3);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        //System.out.println(result3);
    }
}
