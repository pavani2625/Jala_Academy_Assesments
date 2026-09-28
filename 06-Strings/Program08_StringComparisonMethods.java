class Program08_StringComparisonMethods {

    public static void main(String[] args) {

        String first = "Java Programming";
        String second = "java programming";

        System.out.println("equalsIgnoreCase: "
                + first.equalsIgnoreCase(second));

        System.out.println("startsWith Java: "
                + first.startsWith("Java"));

        System.out.println("endsWith Programming: "
                + first.endsWith("Programming"));

        System.out.println("compareTo result: "
                + first.compareTo(second));
    }
}