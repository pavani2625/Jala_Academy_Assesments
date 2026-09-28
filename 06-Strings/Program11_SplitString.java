class Program11_SplitString {

    public static void main(String[] args) {

        String text = "Java,Python,HTML,CSS";

        String[] parts = text.split(",");

        System.out.println("Split strings:");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}