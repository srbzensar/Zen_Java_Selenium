package j.filehandling;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import java.nio.file.Path;
import java.io.File;

public class JXmlReader {
    public static void main(String[] args) {
        try {
            Path xmlPath = Path.of("files/employees.xml");

            Document doc = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(xmlPath.toFile());

            doc.getDocumentElement().normalize();

            NodeList employees = doc.getElementsByTagName("employee");

            System.out.println("Employee Details:\n");

            for (int i = 0; i < employees.getLength(); i++) {
                Element emp = (Element) employees.item(i);

                String name = emp.getElementsByTagName("name").item(0).getTextContent();
                String role = emp.getElementsByTagName("role").item(0).getTextContent();
                String location = emp.getElementsByTagName("location").item(0).getTextContent();

                System.out.printf("Name: %s%nRole: %s%nLocation: %s%n%n", name, role, location);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

