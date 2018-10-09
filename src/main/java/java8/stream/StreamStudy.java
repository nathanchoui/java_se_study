package java8.stream;

import java8.stream.domain.Artist;
import java8.stream.domain.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by za-zhangwei002 on 2018/10/8.
 */
public class StreamStudy {

    public static List<Artist> getAllArtist() {
        List<Artist> allArtists = new ArrayList<>();

        Artist a1 = new Artist();
        a1.setName("Michelangelo Buonarroti");
        a1.setFrom("Italy");
        allArtists.add(a1);

        Artist a2 = new Artist();
        a2.setName("Vincent van Gogh");
        a2.setFrom("Netherlands");
        allArtists.add(a2);

        return allArtists;
    }

    public static void main(String[] args) {
        List<Artist> allArtists = getAllArtist();
        // filter是惰性求值方法，实际上println方法并不会被执行
        // 返回值是Stream的方法都是惰性求值方法
        allArtists.stream().filter(a -> {
            System.out.println("filter() " + a.getName());
            return a.getFrom().equals("Italy");
        });
        // count()是早求值方法，println会被执行
        long count = allArtists.stream().filter(a -> {
            System.out.println("count() " + a.getName());
            return a.getFrom().equals("Italy");
        }).count();

        System.out.println("Italian artists'amount: " + count);


        List<String> collected = Stream.of("a", "b", "c") // 返回一个Stream对象
                .collect(Collectors.toList()); // 将Stream转换成一个List

        collected.forEach(System.out::println);

        List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));
        Track shortestTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getLength()))
                .get();
        System.out.println(shortestTrack.toString());


        int cnt = Stream.of(1, 2, 3)
                // 第一个参数identity初始化为0
                // 第二个参数是BinaryOperator<T> accumulator,顾名思义是累加器
                // acc + element 返回一个新的acc
                .reduce(0, (acc, element) -> acc + element);
        System.out.println(cnt);
    }
}
