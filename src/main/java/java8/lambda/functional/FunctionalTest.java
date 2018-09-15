package java8.lambda.functional;

import java.util.Comparator;
import java.util.function.*;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/9/2.
 */
public class FunctionalTest {

    /**
     * accept 方法接收代码块
     * @param n
     * @param consumer
     */
    public static void consume(int n, Consumer<Integer> consumer) {
        for (int i = 0; i < n; i ++) {
            consumer.accept(i);
        }
    }

    /**
     * 用到了Consumer的 andThen方法
     *
     * @param n
     * @param before 先执行的代码块
     * @param after 后执行的代码块
     */
    public static void consumeAndThen(int n, Consumer<Integer> before, Consumer<Integer> after) {
        for (int i = 0; i < n; i ++) {
            before.andThen(after).accept(i);
        }
    }

    /**
     * get方法获取代码块
     *
     * @param supplier
     */
    public static void supply(Supplier<String> supplier) {
        System.out.println("supply a string: " + supplier.get());
    }

    public static void predicate(Predicate<Integer> predicate, int value) {
        if (predicate.test(value)) {
            System.out.println("test result is true");
        }
    }

    public static void functionCompose(Function<Integer, Integer> a, Function<Integer, Integer> b, Integer x) {
        System.out.println(a.compose(b).apply(x));
    }

    public static void binaryOperatorMinBy(BinaryOperator<Integer> operator, Comparator<Integer> c, Integer a, Integer b) {
        System.out.println(BinaryOperator.minBy(c).apply(a, b));
    }

    public static void main(String[] args) {
        printLine("测试consumer.andThen");
        consumeAndThen(1, i -> System.out.println(i), i -> System.out.println("after"));
        printLine("测试supplier");
        supply(() -> "supplier test");
        printLine("测试predicate");
        predicate(x -> x > 0, 5);
        printLine("测试function.compose");
        functionCompose(x -> x * x, x -> 2 * x, 10);
        printLine("测试BinaryOperator.minBy");
        binaryOperatorMinBy((x , y) -> x + y, (x ,y) -> x - y, 10, 20);
    }

    public static void printLine(String str) {
        System.out.println();
        System.out.println("============ " + str + " ============");
    }




}
