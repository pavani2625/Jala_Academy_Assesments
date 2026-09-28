import java.util.HashSet;
import java.util.Iterator;

public class Program03_HashSet {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Razeena");
        names.add("Ayesha");
        names.add("Rahul");
        names.add("Priya");
        names.add("Arjun");
        names.add("Sneha");
        names.add("Vikram");
        names.add("Anjali");
        names.add("Kiran");
        names.add("Sara");

        System.out.println("Original HashSet:");
        System.out.println(names);

        names.add("Zoya");

        System.out.println("\nAfter adding Zoya:");
        System.out.println(names);

        names.add("Razeena");

        System.out.println("\nAfter adding duplicate Razeena:");
        System.out.println(names);

        System.out.println("\nIterating using Iterator:");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nContains Priya: "
                + names.contains("Priya"));

        System.out.println("Contains John: "
                + names.contains("John"));

        System.out.println("Size of HashSet: "
                + names.size());

        names.remove("Rahul");

        System.out.println("\nAfter removing Rahul:");
        System.out.println(names);

        System.out.println("\nIs HashSet empty: "
                + names.isEmpty());

        HashSet<String> copiedSet =
                new HashSet<>(names);

        System.out.println("\nCopied HashSet:");
        System.out.println(copiedSet);

        names.clear();

        System.out.println("\nAfter removing all elements:");
        System.out.println(names);

        System.out.println("Is HashSet empty: "
                + names.isEmpty());
    }
}