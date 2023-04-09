package FunctionalInterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //************PREDICATE******************//
         // Anonymous class. we cant instantiate the interface. Below code is Anonymous class which implementation of predicate.
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//
//        lesserThan.test(50);


        Predicate<Integer> lesserThan = b -> b<18; //b -> b<18; Implementation of test method that belongs to Predicate Functional interface
        Boolean result = lesserThan.test(50);
        System.out.println(result);


        //************CONSUMER******************//
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);
//        Consumer<String> display2 = i -> System.out.println(i);
//        display2.accept("50");

        //************BICONSUMER******************//
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //************FUNCTION******************//
        Function<String,String> fun = s -> "Hello " + s; // Returns String ("Hello")
        String  str = fun.apply("Ozzy"); // Accepts parameter String ("Ozzy")
        System.out.println(str);

        System.out.println(fun.apply("Apple"));

        //************SUPPLIER******************//
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());




        Predicate<Integer> pred = (p) -> p%2 ==0 ? true : false;
        System.out.println(pred.test(10));

        BiConsumer<Integer,String> bn = (x,y) -> System.out.println(x+y);
        bn.accept(5,"apple");













    }
}
