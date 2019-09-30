package java8.lambda.functional;

import java8.lambda.functional.model.Fruit;
import java8.lambda.functional.model.FruitFactory;

import java.util.function.Function;

/**
 * @author nathan.z
 * @date 2019/9/27.
 */
public class FunctionTest {

    public static void main(String[] args) {

        Function<Fruit, String> printFruit = (Fruit fruit) -> fruit.getColor() + " extra bling!!!";

        FruitFactory.getFruits().forEach((fruit -> {
            System.out.println(printFruit.apply(fruit));
        }));
    }


}
