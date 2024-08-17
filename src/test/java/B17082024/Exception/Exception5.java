package B17082024.Exception;

public class Exception5 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Throwable e) {
            System.out.println("div by zero");
            System.out.println(e.getMessage());
//            e.getMessage();
        } finally {
            System.out.println("I Will Execute Anyhow !!");
        }
    }
}
