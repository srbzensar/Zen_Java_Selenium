package j.filehandling;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FReadJsonDataArray {
    public static void main(String[] args) {
        try {
            // Read the file content into a string
            String content = new String(Files.readAllBytes(Paths.get("files/users.json")));

            // Parse the string into a JSONObject
            JSONArray jsonArray = new JSONArray(content);

            for (int i = 0; i < jsonArray.length(); i++) 
            {
                JSONObject obj = jsonArray.getJSONObject(i);

                System.out.println("\nPerson " + (i + 1) + ":");
                System.out.println("Name: " + obj.getString("name"));
                System.out.println("Role: " + obj.getString("role"));
                System.out.println("Location: " + obj.getString("location"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
