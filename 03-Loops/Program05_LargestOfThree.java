class Program05_LargestOfThree {

    public static void main(String[] args) {

        int number1 = 25;
        int number2 = 40;
        int number3 = 30;

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Largest number: " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Largest number: " + number2);
        } else {
            System.out.println("Largest number: " + number3);
        }
    }
}