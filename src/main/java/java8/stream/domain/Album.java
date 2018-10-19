package java8.stream.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by za-zhangwei002 on 2018/10/18.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {

    private String name;

    private Artist artist;

    private List<Track> tracks;
}
