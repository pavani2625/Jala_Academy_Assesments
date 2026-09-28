import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Program02_OutputStream {

    public static void main(String[] args) {

        String text = "Hello from Java IO.\n"
                    + "This text is written using OutputStream.";

        try (OutputStream outputStream =
                     new FileOutputStream("output.txt")) {

            outputStream.write(text.getBytes());

            System.out.println("Text written successfully");

        } catch (IOException e) {

            System.out.println("Error writing file: "
                    + e.getMessage());
        }
    }
}