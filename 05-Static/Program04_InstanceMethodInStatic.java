class Program04_InstanceMethodInStatic {

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    static void staticMethod() {

        Program04_InstanceMethodInStatic object =
                new Program04_InstanceMethodInStatic();

        object.instanceMethod1();
        object.instanceMethod2();
    }

    public static void main(String[] args) {

        staticMethod();
    }
}