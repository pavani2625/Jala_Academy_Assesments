import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program08_BufferedWriter {

    public static void main(String[] args) {

        String text = "Hello from Java IO.\n"
                    + "This text is written using BufferedWriter.";

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter("bufferedwriter-output.txt"))) {

            writer.write(text);

            System.out.println("Text written successfully");

        } catch (IOException e) {

            System.out.println("Error writing file: "
                    + e.getMessage());
        }
    }
}