package Sep.A22092024.Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ver01 {
  @Test
    public void test_verify(){
        String responseName = "Tushar";
        Assert.assertEquals("Tushar",responseName);
    }
}
