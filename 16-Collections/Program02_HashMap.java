import java.util.HashMap;
import java.util.Map;

public class Program02_HashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Razeena");
        students.put(102, "Ayesha");
        students.put(103, "Rahul");
        students.put(104, "Priya");
        students.put(105, "Arjun");
        students.put(106, "Sneha");
        students.put(107, "Vikram");
        students.put(108, "Anjali");
        students.put(109, "Kiran");
        students.put(110, "Sara");

        System.out.println("Original HashMap:");
        System.out.println(students);

        students.put(111, "Zoya");

        System.out.println("\nAfter inserting ID 111:");
        System.out.println(students);

        System.out.println("\nName of Student ID 105: "
                + students.get(105));

        HashMap<Integer, String> clonedMap =
                (HashMap<Integer, String>) students.clone();

        System.out.println("\nCloned HashMap:");
        System.out.println(clonedMap);

        System.out.println("\nContains key 103: "
                + students.containsKey(103));

        System.out.println("Contains value Rahul: "
                + students.containsValue("Rahul"));

        System.out.println("Is map empty: "
                + students.isEmpty());

        System.out.println("Size of map: "
                + students.size());

        System.out.println("\nAll Student IDs:");

        for (Integer id : students.keySet()) {
            System.out.println(id);
        }

        System.out.println("\nAll Student Names:");

        for (String name : students.values()) {
            System.out.println(name);
        }

        students.remove(104);

        System.out.println("\nAfter removing ID 104:");
        System.out.println(students);

        HashMap<Integer, String> anotherMap = new HashMap<>();

        anotherMap.putAll(students);

        System.out.println("\nCopied Map:");
        System.out.println(anotherMap);
    }
}