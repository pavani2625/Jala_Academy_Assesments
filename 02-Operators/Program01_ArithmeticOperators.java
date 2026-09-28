class Program01_ArithmeticOperators {

    static void arithmeticOperations(int a, int b) {

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        arithmeticOperations(a, b);
    }
}