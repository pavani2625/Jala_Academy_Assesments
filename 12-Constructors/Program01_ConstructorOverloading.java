class Student {

    Student() {
        System.out.println("Default constructor called");
    }

    Student(int id) {
        System.out.println("One-argument constructor called");
        System.out.println("ID: " + id);
    }

    Student(int id, String name) {
        System.out.println("Two-argument constructor called");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Program01_ConstructorOverloading {

    public static void main(String[] args) {

        Student student1 = new Student();

        System.out.println();

        Student student2 = new Student(101);

        System.out.println();

        Student student3 = new Student(102, "Razeena");
    }
}