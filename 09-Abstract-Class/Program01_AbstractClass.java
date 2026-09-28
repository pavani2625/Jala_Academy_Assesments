abstract class Parent {

    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Non-abstract method of Parent");
    }
}

public class Program01_AbstractClass {

    public static void main(String[] args) {

        System.out.println("Abstract class created with:");
        System.out.println("1. Abstract method");
        System.out.println("2. Non-abstract method");
    }
}