interface Animal {

    default void sound() {
        System.out.println("Default sound from Animal interface");
    }
}

class Dog implements Animal {

}

public class Program06_DefaultMethod {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
    }
}