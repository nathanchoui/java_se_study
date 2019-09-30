package java8.lambda.functional;

import java8.lambda.functional.model.Fruit;

import java.util.function.Supplier;

/**
 * @author nathan.z
 * @date 2019/9/30.
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Fruit> freshFruitSupplier = () -> new Fruit(10, "grey");

        System.out.println(freshFruitSupplier.get());
    }
}
