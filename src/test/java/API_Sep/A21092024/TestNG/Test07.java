package API_Sep.A21092024.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test07 {
    @Test
    public void test01(){
        Assert.assertTrue(false);
    }
    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(false);
    }
    @Test(alwaysRun = true)
    public void test03(){
        Assert.assertTrue(true);
    }
}
