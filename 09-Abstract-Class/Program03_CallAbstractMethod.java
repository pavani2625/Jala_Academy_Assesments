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

    void callAbstractMethod() {

        Child object = new Child();

        object.abstractMethod();
    }
}

public class Program03_CallAbstractMethod {

    public static void main(String[] args) {

        Child child = new Child();

        child.callAbstractMethod();
    }
}