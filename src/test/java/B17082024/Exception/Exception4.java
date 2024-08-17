package B17082024.Exception;

//Finally Keyword
public class Exception4 {
    public static void main(String[] args) {
        final  double pi=3.14;
        int a=10;
        try {
            int x=10/0;
        } catch (Exception e) {
            System.out.println("div by zero");
        } finally {
            System.out.println("I Will Execute Anyhow !!");
        }
    }
}
