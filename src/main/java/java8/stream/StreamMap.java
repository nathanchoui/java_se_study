package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by za-zhangwei002 on 2018/10/9.
 */
public class StreamMap {

    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "b", "hello")
                .map(str -> str.toUpperCase()) // 接收一个Function<T, R>, T -> 接收一个Function -> R
                .collect(Collectors.toList());

        collected.forEach(System.out::println);

        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream()) // 合并两个list
                .collect(Collectors.toList());

        together.forEach(System.out::println);
    }
}
