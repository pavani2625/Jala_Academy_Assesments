class Parent {

    private int number = 10;
    private String name = "Java";

    private void privateMethod() {
        System.out.println("Private method of Parent");
    }

    public void displayPrivateMembers() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);

        privateMethod();
    }
}

class Child extends Parent {

    void tryToAccessPrivateMembers() {

        System.out.println("Private members cannot be accessed directly from Child.");
    }
}

public class Program01_Private {

    public static void main(String[] args) {

        Parent parent = new Parent();

        parent.displayPrivateMembers();

        Child child = new Child();

        child.tryToAccessPrivateMembers();
    }
}