class Student {

    Student() {
        System.out.println("This is a real constructor");
    }

    int Student(int number) {
        System.out.println("This is a method, not a constructor");
        return number;
    }

    String Student(String name) {
        System.out.println("This is a method, not a constructor");
        return name;
    }
}

public class Program04_ConstructorReturnType {

    public static void main(String[] args) {

        Student student = new Student();

        int number = student.Student(100);
        System.out.println("Returned int: " + number);

        String name = student.Student("Java");
        System.out.println("Returned String: " + name);
    }
}