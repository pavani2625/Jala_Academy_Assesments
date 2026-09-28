class Program14_UpperLowerCase {

    public static void main(String[] args) {

        String text = "Hello Java";

        String uppercase = text.toUpperCase();
        String lowercase = text.toLowerCase();

        System.out.println("Original String: " + text);
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
    }
}