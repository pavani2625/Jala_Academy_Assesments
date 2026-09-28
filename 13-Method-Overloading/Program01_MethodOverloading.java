class Calculator {

    void add(int a) {
        System.out.println("One parameter: " + a);
    }

    void add(int a, int b) {
        System.out.println("Two parameters: " + (a + b));
    }
}

public class Program01_MethodOverloading {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(10);

        calculator.add(10, 20);
    }
}