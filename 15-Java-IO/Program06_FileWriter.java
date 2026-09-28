import java.io.FileWriter;
import java.io.IOException;

public class Program06_FileWriter {

    public static void main(String[] args) {

        String text = "Hello from Java IO.\n"
                    + "This text is written using FileWriter.";

        try (FileWriter writer =
                     new FileWriter("filewriter-output.txt")) {

            writer.write(text);

            System.out.println("Text written successfully");

        } catch (IOException e) {

            System.out.println("Error writing file: "
                    + e.getMessage());
        }
    }
}