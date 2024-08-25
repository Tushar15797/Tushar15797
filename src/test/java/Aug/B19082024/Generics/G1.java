package Aug.B19082024.Generics;

//Generics
public class G1 {
    public static <T> void temp(T a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        temp(23);
        temp(34.56);
        temp('a');
        temp("tuSHAR");
    }
}
