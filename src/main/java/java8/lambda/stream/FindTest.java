package java8.lambda.stream;

import java8.lambda.functional.model.Fruit;
import java8.lambda.functional.model.FruitFactory;

import java.util.List;
import java.util.Optional;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2019/10/4.
 */
public class FindTest {
    public static void main(String[] args) {
        List<Fruit> fruits = FruitFactory.getFruits();
        boolean hasRedFruit = fruits.stream().anyMatch(fruit -> "red".equals(fruit.getColor()));
        boolean isAllRedFruit = fruits.stream().allMatch(fruit -> "red".equals(fruit.getColor()));
        System.out.println("has red fruit: " + hasRedFruit);
        System.out.println("is all red fruit " + isAllRedFruit);

        Optional<Fruit> anyFruit = fruits.stream()
                .filter(fruit -> "yellow".equals(fruit.getColor()))
                .findAny();
        anyFruit.ifPresent(System.out::println);


    }
}
