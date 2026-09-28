import java.util.ArrayList;
import java.util.Iterator;

public class Program01_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Papaya");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Watermelon");
        fruits.add("Strawberry");

        System.out.println("Original ArrayList:");
        System.out.println(fruits);

        fruits.add("Kiwi");
        System.out.println("\nAfter adding an element:");
        System.out.println(fruits);

        System.out.println("\nIterating using Iterator:");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        fruits.add(2, "Lemon");
        System.out.println("\nAfter adding Lemon at index 2:");
        System.out.println(fruits);

        fruits.remove("Banana");
        System.out.println("\nAfter removing Banana:");
        System.out.println(fruits);

        fruits.remove(3);
        System.out.println("\nAfter removing element at index 3:");
        System.out.println(fruits);

        fruits.set(1, "Mango Updated");
        System.out.println("\nAfter updating index 1:");
        System.out.println(fruits);

        System.out.println("\nElement at index 2: "
                + fruits.get(2));

        System.out.println("Element at index 4: "
                + fruits.get(4));

        System.out.println("\nSize of ArrayList: "
                + fruits.size());

        System.out.println("Contains Apple: "
                + fruits.contains("Apple"));

        System.out.println("Contains Banana: "
                + fruits.contains("Banana"));

        fruits.clear();

        System.out.println("\nAfter removing all elements:");
        System.out.println(fruits);

        System.out.println("Is ArrayList empty: "
                + fruits.isEmpty());
    }
}