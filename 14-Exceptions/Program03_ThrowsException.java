public class Program03_ThrowsException {

    static void checkNumber() throws Exception {

        throw new Exception("Exception thrown from checkNumber()");
    }

    public static void main(String[] args) throws Exception {

        checkNumber();

        System.out.println("Program continues...");
    }
}