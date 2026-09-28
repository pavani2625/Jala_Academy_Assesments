interface Animal {

    void sound();
}

interface Dog extends Animal {

    void eat();
}

class MyDog implements Dog {

    @Override
    public void sound() {
        System.out.println("Dog makes a sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }
}

public class Program07_InterfaceInheritance {

    public static void main(String[] args) {

        MyDog dog = new MyDog();

        dog.sound();
        dog.eat();
    }
}