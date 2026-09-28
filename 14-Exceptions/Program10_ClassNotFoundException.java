public class Program10_ClassNotFoundException {

    public static void main(String[] args) {

        try {

            Class.forName("NonExistingClass");

        } catch (ClassNotFoundException e) {

            System.out.println("Class not found");
        }
    }
}