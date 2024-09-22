package API_Sep.A21092024.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test09 {
    // PUT
    String token;
    Integer bookingID;

    @BeforeTest
    public String getToken() {
        token = "12";
        return token;
    }

    @BeforeTest
    public void getTokenAndBookingID() {
        // POST Req -
        // POST code
        bookingID = 123;
    }


    @Test
    public void testPUTReq() {
        System.out.println(token);
        System.out.println(bookingID);
    }

    @Test
    public void testPUTReq2() {
        System.out.println(token);
        System.out.println(bookingID);
    }

    @Test
    public void testPUTReq3() {
        System.out.println(token);
        System.out.println(bookingID);
    }
}
