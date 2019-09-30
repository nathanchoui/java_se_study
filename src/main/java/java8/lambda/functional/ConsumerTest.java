package java8.lambda.functional;

import java8.lambda.functional.model.Fruit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * consumer 有一个accept方法，接收T，没有返回值。一般用来对T进行逻辑处理。
 *
 * @author nathan.z
 * @date 2019/9/27.
 */
public class ConsumerTest {

    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(new Fruit(12, "blue")
                , new Fruit(9, "red")
                , new Fruit(15, "red"));

        Consumer<Fruit> printFruit = (Fruit fruit) -> System.out.println(fruit);

        processFruit(fruits, printFruit);
    }

    public static void processFruit(List<Fruit> list, Consumer<Fruit> consumer) {
        list.forEach(consumer);
    }
}
