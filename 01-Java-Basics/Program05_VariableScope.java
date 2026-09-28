class Program05_VariableScope {

    int number = 100;

    void display() {

        int number = 50;

        System.out.println("Local variable: " + number);
        System.out.println("Instance variable: " + this.number);
    }

    public static void main(String[] args) {

        Program05_VariableScope obj = new Program05_VariableScope();

        obj.display();
    }
}