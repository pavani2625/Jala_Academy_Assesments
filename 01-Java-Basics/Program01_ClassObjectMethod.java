class Program01_ClassObjectMethod {

    String name = "Razeena";

    void displayName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Program01_ClassObjectMethod obj =
                new Program01_ClassObjectMethod();

        obj.displayName();
    }
}