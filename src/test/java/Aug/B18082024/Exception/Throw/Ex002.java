package Aug.B18082024.Exception.Throw;

public class Ex002 {
    //Lab225
    public static void main(String[] args) throws Exception {
        String s1=null;
        if (s1==null){
            throw new Exception("Add a proper string or not null String");
        }
        s1.trim();
    }
}
