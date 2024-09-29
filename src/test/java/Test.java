
public class Test {

    public static void main(String[] args) {
        String a = null;
        int b = 9;
        System.out.println(a);
        try {
            System.out.println("PASS");
            System.out.println(b / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("FAIL ");
        }
    }
}