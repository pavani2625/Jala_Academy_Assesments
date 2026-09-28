class Program09_PrivateInterface {

    private interface PrivateInterface {

        int number = 100;
        String name = "Java";

        void display();
    }

    static class MyClass implements PrivateInterface {

        @Override
        public void display() {
            System.out.println("Private interface method implemented");
        }
    }

    public static void main(String[] args) {

        MyClass object = new MyClass();

        System.out.println("Number: " + PrivateInterface.number);
        System.out.println("Name: " + PrivateInterface.name);

        object.display();
    }
}