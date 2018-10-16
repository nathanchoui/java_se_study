package java8.stream.exercise;

import java8.stream.domain.Artist;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by za-zhangwei002 on 2018/10/15.
 */
public class StreamExercise2 {

    // 迭代。修改如下代码，将外部迭代转换成内部迭代：
    public static void countBandMembersInternalOrigin(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers().stream();
            totalMembers += members.count();
        }
    }

    public static int countBandMembersInternal(List<Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getMembers().stream().count())
                .reduce(0L, Long::sum)
                .intValue();
    }
}
