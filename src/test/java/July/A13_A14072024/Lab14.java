package July.A13_A14072024;

public class Lab14 {
    public static void main(String[] args) {
        String a = "Tushar";
        String b = "Tushar";

        String c=new String("Tushar");  // Heap Area

        System.out.println(a==b); // check for the ref
        System.out.println(a.equals(b)); //Check for the content

        System.out.println(b==c); // check for the ref
        System.out.println(b.equals(c)); //Check for the content

    }
}
