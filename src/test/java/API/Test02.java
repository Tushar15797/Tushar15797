package API;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test02 {
    @Test
    public void test_post(){
        String jsonBody = "{"
                + "\"key1\": \"value1\","
                + "\"key2\": \"value2\""
                + "}";
        RestAssured
                .given().relaxedHTTPSValidation()
                .baseUri("https://neodev2.safexpay.com")
                .basePath("/agWalletAPI/v3/encrypt")
                .contentType("application/json")
                .body(jsonBody)
                .when()
                .log().all().post().
                then()
                .log().all().statusCode(200);
    }
}
