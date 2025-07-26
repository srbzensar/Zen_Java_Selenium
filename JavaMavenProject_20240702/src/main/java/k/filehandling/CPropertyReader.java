package k.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CPropertyReader {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("files/users.properties");
		
		prop.load(fis);
		
		String userId = prop.getProperty("userId");
		String password = prop.getProperty("password");
		String name = prop.getProperty("name");
		String city = prop.getProperty("city");

		System.out.println(userId);
		System.out.println(password);
		System.out.println(name);
		System.out.println(city);
		
	}

}
