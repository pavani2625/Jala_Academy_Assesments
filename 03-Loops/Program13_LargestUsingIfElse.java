class Program13_LargestUsingIfElse {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        if (number1 > number2 && number1 > number3) {
            System.out.println("Largest number: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Largest number: " + number2);
        } else {
            System.out.println("Largest number: " + number3);
        }
    }
}