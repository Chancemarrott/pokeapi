package BasicPackage;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BasicClass {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2";
        RestAssured.basePath = "/pokemon";
    }

    @Test
    public void statusCodeVerification() {
        given().
        when().
            get("/ditto").
        then().
            statusCode(200);
    }
}
