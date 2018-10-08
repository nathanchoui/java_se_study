package java8.stream;

import java8.stream.domain.Artist;

import java.util.ArrayList;
import java.util.List;

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
    }
}
