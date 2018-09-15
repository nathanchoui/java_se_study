package java8.lambda.functional;

import java.util.function.*;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/9/15.
 */
public class FunctionTest {

    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;

        Consumer<Integer> consumer = x -> System.out.println(x);

        Supplier<String> supplier = () -> "supply a String";

        Function<Integer, Integer> squareF = x -> x * x;
        Function<Integer, Integer> doubleF = x -> x * 2;
        System.out.println(squareF.compose(doubleF).apply(10));

        BiFunction<Integer, Integer, Integer> plus = (x, y) -> x + y;

        UnaryOperator<String> echo = x -> x;
        BinaryOperator<Integer> operatorPlus = (x, y) -> x + y;

    }
}
