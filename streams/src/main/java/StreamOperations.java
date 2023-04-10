import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {


        List<Integer> myList= Arrays.asList(1,2,3,4,3,5,9,2,2,6);
//        myList.forEach(p -> System.out.println(p) );
        myList.forEach(System.out::println);// This forEach() method belongs to Iterable Interface.

        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i -> i%3 ==0)
                .distinct()
                .forEach(System.out::println);// This forEach() method belongs to Stream interface. It will void the operation (terminal operation)

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i%2==0)
                .limit(3) // filter(i%2==0) will return 2,4,2,2,6. Limit(3) will return first 3 items (2,4,2). limit with first 3
                .forEach(System.out::println);

        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2==0)
                .skip(2) // filter(i%2==0) will return 2,4,2,2,6. ->  SKIP(2) will return last 3 items (2,2,6). It wil skip first 2 items.
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP"); //1,2,3,4,3,5,9,2,2,6
        myList.stream()
                .map(number -> number*2)
                .filter(i -> i%3 ==0)
                .forEach(System.out::println);




    }
}
