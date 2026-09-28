class Program06_StringMatches {

    public static void main(String[] args) {

        String text = "12345";

        boolean result = text.matches("[0-9]+");

        System.out.println("String: " + text);
        System.out.println("Contains only numbers: " + result);
    }
}