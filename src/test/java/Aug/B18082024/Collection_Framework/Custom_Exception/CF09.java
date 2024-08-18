package Aug.B18082024.Collection_Framework.Custom_Exception;

public class CF09 {
    public static void main(String[] args) {
        String name= "TUSHAR";
        String name1="TUSHARP";
        if(name.equalsIgnoreCase(name1)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
    //final == Constant
    //finalize == block of code with the try & catch block
    //finally == object class function -- threading use case

}
