package API_Sep.A21092024.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test04 {
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }
}
