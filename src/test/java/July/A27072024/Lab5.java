package July.A27072024;

public class Lab5 {
    public static void main(String[] args) {
        if(args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }else {
            System.out.println("no argument given");
        }
    }
}
