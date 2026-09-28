interface InterfaceA {

    void display();
}

interface InterfaceB {

    void display();
}

class MyClass implements InterfaceA, InterfaceB {

    @Override
    public void display() {
        System.out.println("Display method implemented in MyClass");
    }
}

public class Program05_SameMethodInterfaces {

    public static void main(String[] args) {

        MyClass object = new MyClass();

        object.display();
    }
}