package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        //Reference to a static method
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);// with class name
        s1.calculate(10,20);
        // with Double Colon Operator
        Calculate s2 = Calculator::findSum; // class name :: method name
        s2.calculate(100,35);


        //Reference to instance method
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y); // with object reference
        m1.calculate(5,6);
        // 1. with Double Colon Operator
        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply; // object :: method name
        m2.calculate(8,9);
        // 2.
        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(6,6);



        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));
        // with Double Colon Operator
        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);
        // with Double Colon Operator
        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);


        // Parameters: MyClass=classType, Integer=method parameters, Double=return type
        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;

        BiFunction<String,String,String> v3 = String::concat;








    }
}
