package java8.lambda.functional.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author nathan.z
 * @date 2019/9/29.
 */
public class FruitFactory {

    public static List<Fruit> getFruits() {
        return Arrays.asList(new Fruit(12, "blue")
                , new Fruit(9, "red")
                , new Fruit(15, "red"));
    }
}
