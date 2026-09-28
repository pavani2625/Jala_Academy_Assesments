public class Program16_NumberFormatException {

    public static void main(String[] args) {

        String text = "Java";

        try {

            int number = Integer.parseInt(text);

            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {

            System.out.println("Cannot convert String to number");
        }
    }
}