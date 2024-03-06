package stepdefs;
import common.Headers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import models.Users;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Optional;

import utilities.FileUtils;

import static common.Constants.*;


public class APITest {


    SoftAssert softAssert = new SoftAssert();


    @Given("^user invoke the api for users$")
   public Response getUsers() throws ParseException {
        Response response = Headers.PostHeader(USER_URL);
        return response;
    }


    @When("^the user will get 201 response$")
    public void validate201() throws ParseException {
        softAssert.assertTrue(String.valueOf(getUsers().getStatusCode()).equals("201"));
        softAssert.assertAll();
    }

    @Then("^user will see all the users$")
    public void validateUserDetails() throws  ParseException {

            softAssert.assertEquals(getUsers().getBody().jsonPath().get("name"),FileUtils.getname(), "success message not displayed");
            softAssert.assertEquals(getUsers().getBody().jsonPath().get("job"),FileUtils.getJob(), "success message not displayed");
            softAssert.assertAll();

    }

    @Given("^user invoke the api for \\\"(.*)\\\"$")
    public  Response getSingleUsers(String user) {
        Response response = Headers.GetHeader(users_URL+user);
        return response;

    }

    @When("^the user will get 200 response for users \\\"(.*)\\\"$")
    public void validate200ForUsers(String page){
        softAssert.assertTrue(String.valueOf(getSingleUsers(page).getStatusCode()).equals("200"));
        softAssert.assertAll();
    }


    @Then("^user will see all the users \\\"(.*)\\\"$")
    public void validateUserDetails(String page) {
        softAssert.assertEquals(getSingleUsers(page).getBody().jsonPath().getList("data").size(), FileUtils.getUsers().size(), "success message not displayed");
        softAssert.assertEquals(getSingleUsers(page).getBody().jsonPath().getInt("page"), 1, "success message not displayed");
        softAssert.assertEquals(getSingleUsers(page).getBody().jsonPath().getInt("total_pages"), 2, "success message not displayed");
        softAssert.assertEquals(getSingleUsers(page).getBody().jsonPath().getInt("total"), 12, "success message not displayed");

        for (int i = 0; i < FileUtils.getUsers().size(); i++) {
            HashMap<String,Object> data=(HashMap<String,Object>) getSingleUsers(page).getBody().jsonPath().getList("data").get(i);
            softAssert.assertEquals(data.get("id"), FileUtils.getUsers().get(i).getId(), "success message not displayed");
            softAssert.assertEquals(data.get("email"), FileUtils.getUsers().get(i).getEmail(), "success message not displayed");
            softAssert.assertEquals(data.get("first_name"), FileUtils.getUsers().get(i).first_name(), "success message not displayed");
            softAssert.assertEquals(data.get("last_name"), FileUtils.getUsers().get(i).last_name(), "success message not displayed");
            softAssert.assertEquals(data.get("avatar"), FileUtils.getUsers().get(i).avatar(), "success message not displayed");
            softAssert.assertAll();
        }
    }

        @Given("^user invoke the api for update \\\"(.*)\\\"$")
        public  Response updateUser(String user) {
            Response response = Headers.PatchHeader(USER_URL+user);
            return response;

        }

    @When("^the user will get update 200 response \\\"(.*)\\\"$")
    public void validate200ForUpdateUsers(String user){

       softAssert.assertTrue(String.valueOf(updateUser(user).getStatusCode()).equals("200"));
       softAssert.assertAll();
    }


    @Then("^user will see the updated \\\"(.*)\\\"$")
    public void validateUpdatedUserDetails(String user){

        softAssert.assertEquals(updateUser(user).getBody().jsonPath().get("name"),"Training", "success message not displayed");
        softAssert.assertEquals(updateUser(user).getBody().jsonPath().get("job"),"software", "success message not displayed");
        softAssert.assertAll();


    }


}
