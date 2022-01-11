package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment1 = increment(0);
        System.out.println(increment1);


        //Function<T, R> T-input,  R-output

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiplyBy10_1 = multiplyBy10.apply(2);
        System.out.println(multiplyBy10_1);

        int increment_multiplyBy10 = incrementByOneFunction.andThen(multiplyBy10).apply(1);
        int multiplyBy10_increment = multiplyBy10.andThen(incrementByOneFunction).apply(2);
        System.out.println(increment_multiplyBy10);
        System.out.println(multiplyBy10_increment);

        // BiFunction<>
        System.out.println(
            incrementBuOneAndMultiplyByBiFunction.apply(4,100)
        );



    }


    //Implementing functions in Declarative way

    //Function< , >
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;


    //BiFunction< , , >
    static BiFunction<Integer, Integer, Integer> incrementBuOneAndMultiplyByBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> ((numberToIncrementByOne + 1)*numberToMultiplyBy);







    //Implementing functions in imperative way
    static int increment(int number){
        return number+1;
    }

    static int incrementBuOneAndMultiply(int number, int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }

}
