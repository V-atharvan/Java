
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Atharva");
        names.add("Rahul");
        names.add("Amit");

        // Display elements
        System.out.println("Names: " + names);

        // Access an element
        System.out.println("First name: " + names.get(0));

        // Remove an element
        names.remove("Rahul");

        // Display updated list
        System.out.println("After removal: " + names);

        // Display size
        System.out.println("Size: " + names.size());
    }
}
