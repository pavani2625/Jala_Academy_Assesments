import java.lang.reflect.Method;

public class Program14_NoSuchMethodException {

    public static void main(String[] args) {

        try {

            Class<?> studentClass = Student.class;

            Method method = studentClass.getMethod("display");

            System.out.println("Method found: " + method.getName());

        } catch (NoSuchMethodException e) {

            System.out.println("Method not found");
        }
    }
}

class Student {

    public void show() {
        System.out.println("Student show method");
    }
}