package Aug.B10082024.Encapsulation;

public class Labb04 {
    //lab180
    public static void main(String[] args) {
        ICICI ref =new ICICI("Tushar",100);
        //set the balance
        //admin
        ref.setBal(1000,false);
        System.out.println(ref.getName());

        System.out.println(ref.getBal(false));

        boolean are_you_admin=true;

        ICICI ref1 =new ICICI("Tushar",100);
        ref1.setBal(5000,true);
        System.out.println(ref1.getName());
        System.out.println(ref1.getBal(are_you_admin));

    }
}
