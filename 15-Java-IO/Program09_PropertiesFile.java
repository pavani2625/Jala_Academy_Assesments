import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Program09_PropertiesFile {

    public static void main(String[] args) {

        Properties properties = new Properties();

        try (FileInputStream input =
                     new FileInputStream("config.properties")) {

            properties.load(input);

            System.out.println("Name: "
                    + properties.getProperty("name"));

            System.out.println("Course: "
                    + properties.getProperty("course"));

            System.out.println("City: "
                    + properties.getProperty("city"));

        } catch (IOException e) {

            System.out.println("Error reading properties file: "
                    + e.getMessage());
        }
    }
}