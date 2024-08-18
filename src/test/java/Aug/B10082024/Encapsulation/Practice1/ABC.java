package Aug.B10082024.Encapsulation.Practice1;

 class A1{
     private double marks= 89;

     public double getMarks(){
         return marks;
     }
     public void setMarks(double marks){
         this.marks=marks;
     }

    public void name(){
        System.out.println("Tushar");
    }
}

public class ABC {
    public static void main(String[] args) {
      A1 ref= new A1();
      ref.name();
        System.out.println(ref.getMarks());
        ref.setMarks(90);
        System.out.println(ref.getMarks());
    }
}
