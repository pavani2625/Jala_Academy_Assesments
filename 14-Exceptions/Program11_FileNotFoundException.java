import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program11_FileNotFoundException {

    public static void main(String[] args) {

        try {

            File file = new File("NonExistingFile.txt");

            Scanner scanner = new Scanner(file);

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");
        }
    }
}