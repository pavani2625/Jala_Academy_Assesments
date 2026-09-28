class Program07_SmallerLarger {

    public static void main(String[] args) {

        int number1 = 25;
        int number2 = 40;

        if (number1 < number2) {
            System.out.println("Smaller number: " + number1);
            System.out.println("Larger number: " + number2);
        } else if (number2 < number1) {
            System.out.println("Smaller number: " + number2);
            System.out.println("Larger number: " + number1);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}