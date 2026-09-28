class Calculator {

    void display(int number) {
        System.out.println("One integer parameter: " + number);
    }

    void display(int number, String name) {
        System.out.println("Integer and String parameters: "
                + number + ", " + name);
    }
}

public class Program02_MethodOverloading {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.display(100);

        calculator.display(200, "Java");
    }
}