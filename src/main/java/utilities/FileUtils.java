package utilities;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.Constants;
import exceptions.CustomExceptions;
import org.json.simple.*;
import org.json.simple.parser.*;
import models.User;
import models.Users;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

public class FileUtils {

    public static String readJson(String pathToFileFromResources) {
        try {
            return new String(Files.readAllBytes(Paths.get(Constants.pathToResources + pathToFileFromResources)));
        } catch (IOException e) {
            throw new CustomExceptions("Exception occurred during json read: " + e.getMessage());
        }
    }

    public static Object getObject(String response, TypeReference<?> c) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response, c);
        } catch (IOException e) {
            throw new CustomExceptions("Exception occurred during object mapping: " + e.getMessage());
        }
    }


   public static String writeObject() throws ParseException {
        Users user=new Users();
        user.setName("morpheus");
        user.setJob("leader");

       //JSONParser parser = new JSONParser();
      // Object obj = parser.parse(readJson("createuser.json"));
       //JSONObject jsonObject = (JSONObject)obj;

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        } catch (IOException e) {
            throw new CustomExceptions("Exception occurred during object mapping: " + e.getMessage());
        }
    }

    public static List<User> getUsers() {

        List<User> userList = (List<User>)getObject(readJson("users.json"),new TypeReference<List<User>>() {});

        return userList;
    }

    public static String getname() throws ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(readJson("createuser.json"));
        JSONObject jsonObject = (JSONObject)obj;
        String name = (String)jsonObject.get("name");
        return name;
    }

    public static String getJob() throws ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(readJson("createuser.json"));
        JSONObject jsonObject = (JSONObject)obj;
        String job = (String)jsonObject.get("job");
        return job;
    }

}
