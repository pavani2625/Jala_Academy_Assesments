interface Animal {

    void sound();
}

interface Vehicle {

    void move();
}

class Dog implements Animal, Vehicle {

    @Override
    public void sound() {
        System.out.println("Dog makes a sound");
    }

    @Override
    public void move() {
        System.out.println("Dog can move");
    }
}

public class Program04_TwoInterfaces {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.move();
    }
}