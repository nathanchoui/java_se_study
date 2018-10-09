package java8.stream.exercise;

import java8.stream.domain.Artist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/10/9.
 */
public class StreamExerciseA {

    // 编写一个求和函数， 计算流中所有数之和。例如，int addUp(Stream<Integer> numbers)；
    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (a, b) -> a + b).intValue();
    }

    // 编写一个函数，接受艺术家列表作为参数，返回一个字符串列表，其中包含艺术家的姓名和国籍；
    public static List<String> convertArtist(List<Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getName() + " : " + artist.getFrom())
                .collect(Collectors.toList());
    }

    // 编写一个函数，接受专辑列表作为参数，返回一个由最多包含3 首歌曲的专辑组成的列表


    public static void main(String[] args) {
        System.out.println(addUp(Arrays.asList(1, 2, 3).stream()));

        convertArtist(Arrays.asList(new Artist("Nathan", "Shanghai")
                , new Artist("Winky", "Hangzhou")))
                .forEach(System.out::println);

    }
}
