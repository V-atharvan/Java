
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

      
        names.add("Atharva");
        names.add("Rahul");
        names.add("Amit");

       
        System.out.println("Names: " + names);

      
        System.out.println("First name: " + names.get(0));

     
        names.remove("Rahul");

      
        System.out.println("After removal: " + names);

    
        System.out.println("Size: " + names.size());
    }
}
