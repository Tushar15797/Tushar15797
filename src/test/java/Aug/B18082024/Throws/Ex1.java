package Aug.B18082024.Throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1 {
    //Lab220
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    private static void readFile() throws FileNotFoundException,ArithmeticException {
        String path="c://a.txt";
        File file =new File(path);
        FileReader fileReader=new FileReader(file);
        System.out.println("End the Program");
        int a=10/0;
        System.out.println(a);

    }
}
