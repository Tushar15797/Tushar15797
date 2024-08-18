package Aug.B18082024.Collection_Framework;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class CF03 {
    public static void main(String[] args) throws FileNotFoundException {
        String path="c://a.txt";
        File file= new File(path);
        try {
            FileReader fileReader= new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FNE");
        }
    }
}
