package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/5/15.
 */
public class CreateStream {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("I", "want", "to", "get", "a", "offer");
        // 顺序流
        long count = 0L;
        count = words.stream().filter(w -> w.length() > 2).count();
        System.out.println(count);
        // 并行流
        words.parallelStream().filter(w -> w.length() > 2).forEach(System.out::println);


        // 静态方法
        Stream<Integer> nums = Stream.of(1 , 2, 3, 4, 5);
        // 利用Arrays.stream 方法将数组包装成Stream
        Stream<String> strStream = Arrays.stream(words.toArray(new String[words.size()]), 0 ,3);
        // 空流
        Stream emptyStream = Stream.empty();


    }
}
