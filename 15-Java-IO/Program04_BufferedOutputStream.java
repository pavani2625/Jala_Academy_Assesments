import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program04_BufferedOutputStream {

    public static void main(String[] args) {

        String text = "Hello from Java IO.\n"
                    + "This text is written using BufferedOutputStream.";

        try (BufferedOutputStream outputStream =
                     new BufferedOutputStream(
                             new FileOutputStream("buffered-output.txt"))) {

            outputStream.write(text.getBytes());

            System.out.println("Text written successfully");

        } catch (IOException e) {

            System.out.println("Error writing file: "
                    + e.getMessage());
        }
    }
}