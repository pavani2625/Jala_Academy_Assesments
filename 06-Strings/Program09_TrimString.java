class Program09_TrimString {

    public static void main(String[] args) {

        String text = "   Hello Java   ";

        String trimmedText = text.trim();

        System.out.println("Original String: [" + text + "]");
        System.out.println("Trimmed String: [" + trimmedText + "]");
    }
}