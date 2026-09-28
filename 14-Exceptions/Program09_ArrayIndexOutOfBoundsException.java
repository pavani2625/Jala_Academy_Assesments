public class Program09_ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index is out of bounds");
        }
    }
}