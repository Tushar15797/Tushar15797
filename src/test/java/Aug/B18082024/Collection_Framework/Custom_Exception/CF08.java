package Aug.B18082024.Collection_Framework.Custom_Exception;

public class CF08 {
    public static void main(String[] args) {
        try{
            String s1=null;
            if (s1 == null){
                throw new Exception("Add a proper String or not null String");
            }
            //s1.trim();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
