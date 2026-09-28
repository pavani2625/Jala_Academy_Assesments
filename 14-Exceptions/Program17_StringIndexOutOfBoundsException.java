public class Program17_StringIndexOutOfBoundsException {

    public static void main(String[] args) {

        String text = "Java";

        try {

            System.out.println(text.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("String index is out of bounds");
        }
    }
}