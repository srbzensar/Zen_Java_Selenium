package j.filehandling;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EReadJsonDataSimple {
    public static void main(String[] args) {
        try {
            // Read the file content into a string
            String content = new String(Files.readAllBytes(Paths.get("files/user.json")));

            // Parse the string into a JSONObject
            JSONObject obj = new JSONObject(content);

            System.out.println("Name: " + obj.getString("name"));
            System.out.println("Role: " + obj.getString("role"));
            System.out.println("Location: " + obj.getString("location"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
