import java.io.FileReader;
import java.io.IOException;

public class Program05_FileReader {

    public static void main(String[] args) {

        try (FileReader reader =
                     new FileReader("input.txt")) {

            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {

            System.out.println("Error reading file: "
                    + e.getMessage());
        }
    }
}