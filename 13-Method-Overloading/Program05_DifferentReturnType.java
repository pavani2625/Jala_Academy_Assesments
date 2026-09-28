class Calculator {

    int display(int number) {
        return number;
    }

}

public class Program05_DifferentReturnType {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.display(100);

        System.out.println("Returned value: " + result);

        System.out.println(
                "Methods cannot be overloaded using return type alone."
        );
    }
}