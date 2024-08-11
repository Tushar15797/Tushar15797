package B11082024.StaticKeyword;

public class Labb153 {
        //Static - Block , Method (Data member), Function, Class
        public static void main(String[] args) {
            ATB1 a= new ATB1("Tushar");
        }
    }

    class ATB1 {
        {
            System.out.println("IIB");
            System.out.println("Reading The Data From CSV File");
        }

        static {
            System.out.println("Load the Class ?, I Will Execute First");
        }

        private String name;
        private String Phone;
        static String Coursename = "ATB1";

        public String getName() {
            return name;
        }
        public void setName(){
            this.name=name;
        }
        public ATB1(String name){
            this.name=name;
        }
         static void doAssignment(){
            System.out.println("Do Assignment");
        }
        static class A{

        }
    }

