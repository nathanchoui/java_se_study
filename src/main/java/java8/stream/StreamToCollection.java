package java8.stream;

import java8.stream.domain.Track;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by za-zhangwei002 on 2018/10/18.
 */
public class StreamToCollection {

    public static void main(String[] arg) {
        //
        List<Track> tracks = Arrays.asList(new Track("Bakai", 524, true),
                new Track("Violets for Your Furs", 1000, false),
                new Track("Time Was", 451, false));

        Set<String> names = tracks.stream()
                .map(t -> t.getName())
                //.collect(Collectors.toSet());
                .collect(Collectors.toCollection(TreeSet::new)); // 指定Set实现
        names.forEach(System.out::println);

        double averageNumberOfTrack = tracks.stream()
                .collect(Collectors.averagingInt(track -> track.getLength()))
                .doubleValue();
        System.out.println(averageNumberOfTrack);

        // 分块
        Map<Boolean, List<Track>> soloAndBands = tracks.stream()
                .collect(Collectors.partitioningBy(Track::isSolo));

        soloAndBands.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach(System.out::println);
        });


        // 分组
//        Map<Boolean, List<Track>> soloAndBandsRef =

    }
}
