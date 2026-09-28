class Program04_Substring {

    public static void main(String[] args) {

        String text = "Hello Java";

        String part1 = text.substring(0, 5);
        String part2 = text.substring(6);

        System.out.println("Original String: " + text);
        System.out.println("First part: " + part1);
        System.out.println("Second part: " + part2);
    }
}