class MyClass implements PublicInterface {

    @Override
    public void display() {
        System.out.println("Interface method implemented in MyClass");
    }
}

public class Program08_PublicInterface {

    public static void main(String[] args) {

        MyClass object = new MyClass();

        System.out.println("Number: " + PublicInterface.number);
        System.out.println("Name: " + PublicInterface.name);

        object.display();
    }
}