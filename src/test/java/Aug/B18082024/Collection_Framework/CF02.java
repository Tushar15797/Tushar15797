package Aug.B18082024.Collection_Framework;

public class CF02 {
    public static void main(String[] args) {
        extracted1();
    }
    private static void extracted1() {
        extracted2();
    }
    private static void extracted2() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]);    //Unchecked - ArrayIndexOutofBoundException
        } catch (Exception e) {
            System.out.println("ArrayIndexOutofBound");
        } finally {
            // File.close, sc.close, sqlconnection.close
            System.out.println("End of the Program");
        }
    }
}
