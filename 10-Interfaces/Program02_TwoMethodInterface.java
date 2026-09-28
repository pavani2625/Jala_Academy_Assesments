interface Animal {

    void sound();

    void eat();
}

abstract class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog makes a sound");
    }

}

public class Program02_TwoMethodInterface {

    public static void main(String[] args) {

        Dog dog = new Dog() {

            @Override
            public void eat() {
                System.out.println("Dog eats food");
            }
        };

        dog.sound();
    }
}