package java8.lambda.stream;

import java8.lambda.functional.model.Fruit;
import java8.lambda.functional.model.FruitFactory;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2019/10/3.
 */
public class FilterTest {

    public static void main(String[] args) {
        List<Fruit> fruits = FruitFactory.getFruits();
        List<Fruit> res = fruits.stream()
                // 过滤只需红色
                .filter(fruit -> fruit.getColor().equals("red"))
                // 过滤相同的对象
                .distinct()
                // 只需第一个
//                .limit(1)
                // 跳过第一个
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
