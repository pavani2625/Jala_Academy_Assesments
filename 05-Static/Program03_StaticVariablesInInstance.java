class Program03_StaticVariablesInInstance {

    static int staticNumber1 = 10;
    static int staticNumber2 = 20;

    void printStaticVariables() {

        System.out.println("Static variable 1: " + staticNumber1);
        System.out.println("Static variable 2: " + staticNumber2);
    }

    public static void main(String[] args) {

        Program03_StaticVariablesInInstance object =
                new Program03_StaticVariablesInInstance();

        object.printStaticVariables();
    }
}