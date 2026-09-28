class Parent {

    Parent() {

        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {

    Child() {

        super();

        System.out.println("Child constructor called");
    }
}

public class Program05_SuperConstructor {

    public static void main(String[] args) {

        Child child = new Child();
    }
}