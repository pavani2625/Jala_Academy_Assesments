class Program07_CallMethodsInMain {

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

        // Calling static methods directly
        staticMethod1();
        staticMethod2();

        // Creating object for instance methods
        Program07_CallMethodsInMain object =
                new Program07_CallMethodsInMain();

        object.instanceMethod1();
        object.instanceMethod2();
    }
}