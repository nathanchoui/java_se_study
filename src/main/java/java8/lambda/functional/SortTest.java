package java8.lambda.functional;

import java8.lambda.functional.model.Fruit;
import java8.lambda.functional.model.FruitFactory;

import java.util.Comparator;
import java.util.List;

/**
 * @author nathan.z
 * @date 2019/9/30.
 */
public class SortTest {

    public static void main(String[] args) {
        List<Fruit> fruits = FruitFactory.getFruits();
        fruits.sort(Comparator.comparing(Fruit::getWeight)
                .reversed()
                .thenComparing(Fruit::getColor));
        fruits.forEach(System.out::println);
    }
}
