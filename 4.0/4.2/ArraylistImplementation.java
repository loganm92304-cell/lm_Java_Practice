import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Insert at index
        list.add(1, "Orange");

        // Get element
        System.out.println("Element at index 2: " + list.get(2));

        // Update element
        list.set(2, "Grapes");

        // Remove by value
        list.remove("Banana");

        // Remove by index
        list.remove(0);

        // Check size
        System.out.println("Size: " + list.size());

        // Check contains
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // Iterate using Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Clear list
        list.clear();
        System.out.println("After clear: " + list);
    }
}