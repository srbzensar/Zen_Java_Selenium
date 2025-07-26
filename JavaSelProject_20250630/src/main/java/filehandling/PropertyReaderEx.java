package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderEx {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("files/users.properties");
		
		p.load(fis);
		
		System.out.println(p.getProperty("userId"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("city"));
		
		
	}

}
