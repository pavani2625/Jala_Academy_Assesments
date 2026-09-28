class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}

public class Program06_CustomException {

    public static void main(String[] args) {

        try {

            throw new MyException("This is my custom exception");

        } catch (MyException e) {

            System.out.println(e.getMessage());
        }
    }
}