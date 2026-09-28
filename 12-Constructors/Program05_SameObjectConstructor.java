class Student {

    Student() {
        System.out.println("Constructor called");
    }

    void display() {
        System.out.println("Display method called");
    }
}

public class Program05_SameObjectConstructor {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}