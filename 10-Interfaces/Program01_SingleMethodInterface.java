interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog makes a sound");
    }
}

public class Program01_SingleMethodInterface {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
    }
}