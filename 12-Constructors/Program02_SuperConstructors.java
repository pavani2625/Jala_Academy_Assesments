class Parent {

    Parent() {
        System.out.println("Parent default constructor called");
    }

    Parent(int number) {
        System.out.println("Parent argument constructor called");
        System.out.println("Number: " + number);
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Child default constructor called");
    }

    Child(int number) {
        super(number);
        System.out.println("Child argument constructor called");
    }
}

public class Program02_SuperConstructors {

    public static void main(String[] args) {

        System.out.println("Calling parent default constructor:");

        Child child1 = new Child();

        System.out.println();

        System.out.println("Calling parent argument constructor:");

        Child child2 = new Child(100);
    }
}