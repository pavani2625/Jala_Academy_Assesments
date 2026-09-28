import java.io.IOException;

public class Program12_IOException {

    public static void main(String[] args) {

        try {

            throw new IOException("IOException occurred");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}