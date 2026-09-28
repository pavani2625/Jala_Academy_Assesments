class ConstructorAccess {

    private ConstructorAccess() {
        System.out.println("Private constructor called");
    }

    public ConstructorAccess(int number) {
        System.out.println("Public constructor called");
        System.out.println("Number: " + number);
    }

    protected ConstructorAccess(String name) {
        System.out.println("Protected constructor called");
        System.out.println("Name: " + name);
    }

    ConstructorAccess(double value) {
        System.out.println("Default constructor called");
        System.out.println("Value: " + value);
    }

    static void callPrivateConstructor() {

        ConstructorAccess object = new ConstructorAccess();

        System.out.println("Private constructor accessed inside the same class");
    }
}

public class Program03_ConstructorAccess {

    public static void main(String[] args) {

        ConstructorAccess.callPrivateConstructor();

        ConstructorAccess publicObject =
                new ConstructorAccess(100);

        ConstructorAccess protectedObject =
                new ConstructorAccess("Java");

        ConstructorAccess defaultObject =
                new ConstructorAccess(10.5);
    }
}