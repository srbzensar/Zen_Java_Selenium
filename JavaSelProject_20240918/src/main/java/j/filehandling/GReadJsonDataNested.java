package j.filehandling;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GReadJsonDataNested {
    public static void main(String[] args) {
        try {
            // Read the file content into a string
            String content = new String(Files.readAllBytes(Paths.get("files/user_details.json")));
//            System.out.println(content);
            
            // Parse the string into a JSONObject
//            Here obj is referring to the complete JSON object read from the JSON file
            JSONObject obj = new JSONObject(content);
            System.out.println(obj.getJSONObject("employee").getString("name"));
            System.out.println(obj.getJSONObject("employee").getJSONObject("location").getString("city"));

            //            or
            
//            Here obj is referring to "employee" JSON object
//            JSONObject obj = new JSONObject(content).getJSONObject("employee");
//            System.out.println("Name: " + obj.getString("name"));
//            System.out.println("Role: " + obj.getString("role"));
//            
//            JSONObject loc = obj.getJSONObject("location");
//            System.out.println("Location: " + loc.getString("city") + ", " + loc.getString("state") + ", " + loc.getString("country"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
