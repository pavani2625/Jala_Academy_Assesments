class Program01_StaticInstance {

    // Static variables
    static int staticNumber1 = 10;
    static int staticNumber2 = 20;

    // Instance variables
    int instanceNumber1 = 30;
    int instanceNumber2 = 40;

    // Static methods
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance methods
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

        System.out.println("Static variable 1: " + staticNumber1);
        System.out.println("Static variable 2: " + staticNumber2);

        Program01_StaticInstance object = new Program01_StaticInstance();

        System.out.println("Instance variable 1: " + object.instanceNumber1);
        System.out.println("Instance variable 2: " + object.instanceNumber2);

        staticMethod1();
        staticMethod2();

        object.instanceMethod1();
        object.instanceMethod2();
    }
}