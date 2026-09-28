import java.lang.reflect.Field;

public class Program13_NoSuchFieldException {

    public static void main(String[] args) {

        try {

            Class<?> studentClass = Student.class;

            Field field = studentClass.getField("age");

            System.out.println("Field found: " + field.getName());

        } catch (NoSuchFieldException e) {

            System.out.println("Field not found");
        }
    }
}

class Student {

    public String name = "Java";
}