class Student {

    int id;
    String name;

    Student() {

        this(101, "Razeena");
    }

    Student(int id, String name) {

        this.id = id;
        this.name = name;

        System.out.println("Argument constructor called");
    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Program04_ThisArgumentConstructor {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}