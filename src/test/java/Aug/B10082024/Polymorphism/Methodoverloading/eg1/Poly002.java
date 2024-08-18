package Aug.B10082024.Polymorphism.Methodoverloading.eg1;

public class Poly002 {
//Encapsulation - Data hiding
    private String name;
    public String getName(){
        return name;
    }
    void setName(){
        this.name=name;
    }
    int add(int a,int b){
        return a+b;
    }
    //Method overloading
    int add(int a,int b,int c){
        System.out.println("Hello");
        return a+b+c;
    }
    double add(double a,double b,float f){
        return a+b+f;
    }
    String add(String a,String b){
        return a+b;
    }
   Poly002(){
   }
   Poly002(int a){
   }
   Poly002(int a,int b){
   }
   Poly002(int a, int b, int c) {
   }
   Poly002(int a,int b,int c, String d){
   }
}
