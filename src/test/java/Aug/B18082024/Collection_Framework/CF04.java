package Aug.B18082024.Collection_Framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CF04 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
    private static void readFile() throws FileNotFoundException {
        System.out.println("Hello Tushar");
        String path= "/users/promode.downloads/ad1.mp4";
        File file= new File(path);
        FileReader fileReader= new FileReader(file);

        //Read the file txt it can read the file
        System.out.println("End of the Program");
    }
}
