class Program05_StaticMethodInInstance {

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod() {

        staticMethod1();
        staticMethod2();
    }

    public static void main(String[] args) {

        Program05_StaticMethodInInstance object =
                new Program05_StaticMethodInInstance();

        object.instanceMethod();
    }
}