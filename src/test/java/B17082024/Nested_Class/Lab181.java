package B17082024.Nested_Class;

public class Lab181 {
    Integer a=10;
    void oc(){
        //System.out.println(b); // Not able to access inner class data
        System.out.println("OC");
    }
    class innerClass{
        //Advantage of inner class to access data
        Integer b=20;
        void  ic(){
            System.out.println(a);
            System.out.println("IC");
        }
    }
}
