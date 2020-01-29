import io.restassured.RestAssured;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DemoTest {

    public static void main (String ... args){

        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";

        Response res=given().
                when().get("/delhi");
        System.out.println("res-->"+res.asString());







    }
}
