class Calculator {

    void display(int number) {
        System.out.println("Integer parameter: " + number);
    }

    void display(String name) {
        System.out.println("String parameter: " + name);
    }
}

public class Program04_DifferentParameterTypes {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.display(100);

        calculator.display("Java");
    }
}