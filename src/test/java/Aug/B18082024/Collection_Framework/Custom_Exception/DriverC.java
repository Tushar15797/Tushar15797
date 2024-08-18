package Aug.B18082024.Collection_Framework.Custom_Exception;

public class DriverC {
    //lab222
    //throw
    //Custom Exception
    public static void main(String[] args) {
        Bank sbi =new Bank("INR",100);
        System.out.println(sbi);
//        Integer icici= new Bank("INR",200);
//        Integer total=sbi.add(icici);
//        System.out.println(total);

        Bank jpMorgan =new Bank("AED",89);
        Integer totalNew = sbi.add(jpMorgan);
        System.out.println(totalNew);
    }
}
