import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("atharva", "rahul", "priya");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
