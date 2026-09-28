class Program02_InstanceVariablesInStatic {

    int instanceNumber1 = 10;
    int instanceNumber2 = 20;

    static void printInstanceVariables() {

        Program02_InstanceVariablesInStatic object =
                new Program02_InstanceVariablesInStatic();

        System.out.println("Instance variable 1: " + object.instanceNumber1);
        System.out.println("Instance variable 2: " + object.instanceNumber2);
    }

    public static void main(String[] args) {

        printInstanceVariables();
    }
}