import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Program03_BufferedInputStream {

    public static void main(String[] args) {

        try (BufferedInputStream inputStream =
                     new BufferedInputStream(
                             new FileInputStream("input.txt"))) {

            int data;

            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {

            System.out.println("Error reading file: "
                    + e.getMessage());
        }
    }
}