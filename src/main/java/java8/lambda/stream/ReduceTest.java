package java8.lambda.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2019/10/4.
 */
public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,56,2,5,62);
//        Integer sum = numbers.stream()
//                .reduce(0, (a, b) -> a + b);
        Integer sum = numbers.stream()
//                .max(Integer::compareTo)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
