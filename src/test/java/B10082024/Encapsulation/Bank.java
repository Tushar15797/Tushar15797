package B10082024.Encapsulation;

   class DataHiding {
        private double money = 95000;

        //getter Method  --- get Private Data
        public double getMoney() {
            return money;
        }
        //Setter Method -- Set Private Data
        public void setMoney(double money){
            this.money=money;
        }
        public void withdraw(){
            System.out.println("u can Withdraw........!!");
        }
 }
public class Bank {
    public static void main(String[] args) {
        DataHiding ref = new DataHiding();
        System.out.println("Money : " + ref.getMoney());
        ref.setMoney(65000);
        System.out.println("Money : " + ref.getMoney());
    }
}


