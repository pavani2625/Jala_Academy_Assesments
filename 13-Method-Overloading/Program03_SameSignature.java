class Calculator {

    void display(int number) {
        System.out.println("Method with int parameter: " + number);
    }
}

public class Program03_SameSignature {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.display(100);

        System.out.println(
                "Two methods with the same signature cannot be overloaded."
        );
    }
}