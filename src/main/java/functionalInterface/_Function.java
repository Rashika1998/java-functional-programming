package functionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment1 = increment(0);
        System.out.println(increment1);

        Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

    }

    static int increment(int number){
        return number+1;
    }

}
