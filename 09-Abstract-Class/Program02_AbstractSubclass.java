abstract class Parent {

    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Non-abstract method of Parent");
    }
}

class Child extends Parent {

    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in Child");
    }

    void childMethod() {
        System.out.println("Method of Child");
    }

    public void accessParentMethod() {

        Child object = new Child();

        object.nonAbstractMethod();
    }
}

public class Program02_AbstractSubclass {

    public static void main(String[] args) {

        Child child = new Child();

        child.accessParentMethod();
    }
}