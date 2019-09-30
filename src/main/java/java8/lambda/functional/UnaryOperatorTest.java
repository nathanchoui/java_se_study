package java8.lambda.functional;

import java8.lambda.functional.model.Fruit;

import java.util.function.UnaryOperator;

/**
 * @author nathan.z
 * @date 2019/9/30.
 */
public class UnaryOperatorTest {

    public static void main(String[] args) {
        UnaryOperator<Fruit> unaryOperator = (Fruit fruit) -> {
          fruit.setWeight(fruit.getWeight() + 1);
          return fruit;
        };

        System.out.println(unaryOperator.apply(new Fruit(16, "red")));
    }
}
