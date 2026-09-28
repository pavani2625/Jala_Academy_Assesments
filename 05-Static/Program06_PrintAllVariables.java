class Program06_PrintAllVariables {

    static int staticNumber1 = 10;
    static int staticNumber2 = 20;

    int instanceNumber1 = 30;
    int instanceNumber2 = 40;

    public static void main(String[] args) {

        System.out.println("Static variable 1: " + staticNumber1);
        System.out.println("Static variable 2: " + staticNumber2);

        Program06_PrintAllVariables object =
                new Program06_PrintAllVariables();

        System.out.println("Instance variable 1: " + object.instanceNumber1);
        System.out.println("Instance variable 2: " + object.instanceNumber2);
    }
}