package java8.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2019/10/3.
 */
public class MapTest {

    public static void main(String[] args) {


        Stream<String> stringStream = Arrays.stream(new String[]{"hello", "world"});
        List<String> list = stringStream
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);

        exercise2();


    }

    /**
     * [1,2,3,4,5] -> [1,4,9,16,25]
     */
    public static void exercise1() {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> res = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(res);
    }

    /**
     * [1,2,3],[4,5] -> [1,4],[1,5],[2,4]...[3,5]
     */
    public static void exercise2() {
        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5);
        List<Integer[]> pair =
                nums1.stream()
                        .flatMap(i -> nums2.stream()
                                .map(j -> new Integer[]{i, j}))
                        .collect(Collectors.toList());
        System.out.println();
        pair.forEach(arr -> {
            Arrays.stream(arr).forEach(System.out::print);
            System.out.println();
        });
    }
}
