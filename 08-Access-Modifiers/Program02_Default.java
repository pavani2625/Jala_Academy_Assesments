class DefaultClass {

    int number = 100;
    String name = "Java";

    void display() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }
}

public class Program02_Default {

    public static void main(String[] args) {

        DefaultClass object = new DefaultClass();

        System.out.println("Number: " + object.number);
        System.out.println("Name: " + object.name);

        object.display();
    }
}