class Student {

    int id = 101;
    String name = "Razeena";

    void display() {

        System.out.println("Using this:");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);

        System.out.println("\nWithout using this:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Program01_This {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}