package B17082024.Exception;
//lab212
public class Exception3 {
    public static void main(String[] args) {
        int c = 0;

        try {
            c = 10 / 0;
            System.out.println(c);
        } //catch (Exception e) {
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);
        System.out.println("End");

    }
}
