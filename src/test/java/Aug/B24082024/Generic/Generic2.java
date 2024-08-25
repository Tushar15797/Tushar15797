package Aug.B24082024.Generic;

public class Generic2 {
    public static void main(String[] args) {
        temp("tushar");
        temp(123);
        temp(true);

        sum(3,4);
        sum("tushar","Patil");
    }
    public static <tushar> tushar sum(tushar a, tushar b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
    public static <Patil> void temp(Patil name){
        System.out.println(name);
    }
}
