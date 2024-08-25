package Aug.B18082024.Exception.Throws;

// Exception Passing --> Exception Passing Means if Sub class has error it passes to Parent also
// Exception -> Hour on Method and Click on Extract then click on Method
public class Exception_Passing {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i= new Integer[2];  //Length 2 -- 0,1 & Value[Null,Null]
            System.out.println(i[3]);  // Axis 3 Index
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }
}
