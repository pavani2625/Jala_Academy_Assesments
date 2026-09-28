class Student {

    int id = 101;
    String name = "Razeena";

    Student() {

        System.out.println("Default constructor of Student");
    }

    Student(int id, String name) {

        this();

        this.id = id;
        this.name = name;

        System.out.println("Parameterized constructor of Student");
    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Program03_ThisConstructor {

    public static void main(String[] args) {

        Student student = new Student(102, "Java");

        student.display();
    }
}