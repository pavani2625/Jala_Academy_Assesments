interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog makes a sound");
    }
}

public class Program03_InterfaceReference {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
    }
}