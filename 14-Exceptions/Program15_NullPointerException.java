public class Program15_NullPointerException {

    public static void main(String[] args) {

        String text = null;

        try {

            System.out.println(text.length());

        } catch (NullPointerException e) {

            System.out.println("Null Pointer Exception occurred");
        }
    }
}