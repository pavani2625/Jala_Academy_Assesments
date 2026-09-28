class Parent {

    int number = 100;
    String name = "Parent";

}

class Child extends Parent {

    int number = 200;
    String name = "Child";

    void display() {

        System.out.println("Child class members:");
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);

        System.out.println("\nParent class members using super:");
        System.out.println("Number: " + super.number);
        System.out.println("Name: " + super.name);
    }
}

public class Program02_Super {

    public static void main(String[] args) {

        Child child = new Child();

        child.display();
    }
}