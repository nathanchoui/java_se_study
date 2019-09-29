package java8.lambda.functional.predicate;

import java8.lambda.functional.model.Fruit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate test方法，接收一个参数T，返回boolean，一个用来传递一个逻辑判断
 *
 *
 * @author nathan.z
 * @date 2019/9/26.
 */
public class PredicateTest {

    public static void main(String[] args) {

        // 是否超重
        Predicate<Fruit> isOverweight = (Fruit fruit) -> fruit.getWeight() > 10;

        // 是否是红
        Predicate<Fruit> isRed = (Fruit fruit) -> "red".equalsIgnoreCase(fruit.getColor());

        Predicate<Fruit> notBlue = (Fruit fruit) -> !"blue".equalsIgnoreCase(fruit.getColor());


        List<Fruit> fruits = Arrays.asList(new Fruit(12, "blue")
                , new Fruit(9, "red")
                , new Fruit(15, "red"));

        filterFruit(fruits, isOverweight).forEach(System.out::println);
        System.out.println("---------------------------------------");
        filterFruit(fruits, isRed).forEach(System.out::println);
        System.out.println("---------------------------------------");
        filterFruit(fruits, isOverweight.and(isRed)).forEach(System.out::println);
        System.out.println("---------------------------------------");
        filterFruit(fruits, notBlue.negate()).forEach(System.out::println);

    }

    public static List<Fruit> filterFruit(List<Fruit> list, Predicate<Fruit> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
