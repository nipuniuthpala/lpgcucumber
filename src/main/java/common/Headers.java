package common;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import utilities.FileUtils;

import static io.restassured.RestAssured.given;

public class Headers {

    public static Response GetHeader(String endpoint) {

        return given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().get(endpoint).then().contentType(ContentType.JSON).extract().response();

    }


   public static Response PostHeader(String endpoint) throws ParseException {



        return
                given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).body(FileUtils.writeObject()).
                        when().post(endpoint).
                        then().contentType(ContentType.JSON).extract().response();
    }



    public static Response PostHeader1(String endpoint) {
        return
                given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).body(FileUtils.readJson("createuser.json")).
                        when().post(endpoint).
                        then().contentType(ContentType.JSON).extract().response();
    }


    public static Response PatchHeader(String endpoint) {

        String request="{\"name\": \"Training\",\"job\": \"software\"}";

        return
                given().headers("Content-Type",ContentType.JSON, "Accept", ContentType.JSON).body(request).
                        when().patch(endpoint).
                        then().contentType(ContentType.JSON).extract().response();
    }



public static RequestSpecification getBasicAuth(){
    return RestAssured.given().auth().basic("username","password");
}



@Test
    public void getTest(){

    given().queryParam("page",2).headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().get("https://reqres.in/api/users").then().assertThat().statusCode(200);

}


@Test
    public void deleteTest(){
        given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().delete("https://reqres.in/api/users/2").then().assertThat().statusCode(204);
}

}