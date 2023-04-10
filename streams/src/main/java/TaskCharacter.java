import java.util.Arrays;
import java.util.List;

public class TaskCharacter {

    public static void main(String[] args) {

        // Given list words, print the number oc characters for each word

        List<String> words = Arrays.asList("Java","Apple","Honda","Developer");

        String x = "Java";
        System.out.println(x.length());


        // map(w -> w.length()); expecting parameter and returns something (length)
        words.stream()
                //.map(w -> w.length())
                .map(String::length)// will return length of all the Strings. And If lambda expression calls a method we directly use Double Colon Operators
                .forEach(System.out::println);


    }
}
