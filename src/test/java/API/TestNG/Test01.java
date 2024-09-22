package API.TestNG;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test01 {
    @Test
    public void test_get() {

        RestAssured
                .given().relaxedHTTPSValidation()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .when()
                .log().all().get().
                then()
                .log().all().statusCode(200);
    }
}
