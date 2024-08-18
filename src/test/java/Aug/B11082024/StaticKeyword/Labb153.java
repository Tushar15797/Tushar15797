package Aug.B11082024.StaticKeyword;

public class Labb153 {
        //Static - Block , Method (Data member), Function, Class
        public static void main(String[] args) {
            ATB1 a= new ATB1("Tushar");
            ATB1.doAssignment();
            System.out.println(a.getName());
            a.setName("Patil");
            System.out.println(a.getName());

            System.out.println(a.getPhone());
            a.setPhone("9970401904");
            System.out.println(a.getPhone());
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
        public void setName(String name){
            this.name=name;
        }
        public String getPhone(){
            return "9970234567";
        }
        public void setPhone(String phone){
            this.Phone=Phone;
        }
        public ATB1(String name){
            this.name=name;
        }
         static void doAssignment(){
            System.out.println("Do Assignment");
        }
    }
