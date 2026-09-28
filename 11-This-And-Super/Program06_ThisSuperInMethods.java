class Parent {

    int number = 100;

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    int number = 200;

    void display() {

        System.out.println("Child number using this: " + this.number);
        System.out.println("Parent number using super: " + super.number);

        super.display();
    }
}

public class Program06_ThisSuperInMethods {

    public static void main(String[] args) {

        Child child = new Child();

        child.display();
    }
}