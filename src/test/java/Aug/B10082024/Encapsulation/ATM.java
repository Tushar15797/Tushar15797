package Aug.B10082024.Encapsulation;

// Encapsulation : The Process of Binding States and Behaviour of an object Together is known as Encapsulation.

public class ATM {
    double money=1000000;  // state  --- variable
    public void withdraw() // Behaviour  --- Method
    {
        System.out.println("U can Withdraw........!!!!");
    }
}
class bank{
    public static void main(String[] args) {
        ATM ref= new ATM();
        System.out.println("Money : " + ref.money);
        ref.withdraw();
    }

}
