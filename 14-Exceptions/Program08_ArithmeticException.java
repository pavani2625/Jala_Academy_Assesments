public class Program08_ArithmeticException {

    public static void main(String[] args) {

        int number1 = 50;
        int number2 = 0;

        try {

            int result = number1 / number2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception occurred");
        }
    }
}