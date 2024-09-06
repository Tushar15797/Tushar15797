package July.A13_A14072024;

public class Lab16 {
    public static void main(String[] args) {
        String password="Test@123";
        String pass=password.toLowerCase();
        System.out.println(pass);

        System.out.println(pass==password);
        System.out.println(pass.equals(password));

        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf('@'));
        System.out.println(password.length());
    }
}
