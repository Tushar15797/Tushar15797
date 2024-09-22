package API_Sep.A21092024.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test05 {
    @Parameters("browser")
    @Test
    void demo1(String value){
        System.out.println("Browser is " +value);
        // Open the Browser and select dadadada

    }
}
