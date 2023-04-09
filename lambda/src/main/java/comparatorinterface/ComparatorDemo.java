package comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //Ascending sort
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list,new MyComparator()); // 1. Compares with Behavior Parameterization
        System.out.println(list);

        System.out.println("Collection sort ");
        Collections.sort(list,((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1:0)); // 2. Compares with Lambda Expression

        //Ascending
        list.sort((o1,o2) -> o1.compareTo(o2)); // 3. compareTo(o2) method -> compares one integer to another integer
        System.out.println(list);
        //Descending
        list.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(list);


        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN)
        );

       //Comparator<Apple> sortApple = Comparator comparing((apple) -> apple.getWeight());
       Comparator<Apple> sortApple = comparing((apple) -> apple.getWeight());
       myInventory.sort(sortApple);
       System.out.println(myInventory);

       myInventory.sort(comparing((apple) -> apple.getWeight())); // with static import

       myInventory.sort(comparing(Apple::getWeight));

       //Reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //Chaining
        myInventory
                .sort(comparing(Apple::getWeight)
                        .reversed()
                                .thenComparing(Apple::getColor));
        System.out.println(myInventory);












































    }
}
