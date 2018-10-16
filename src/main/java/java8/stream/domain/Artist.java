package java8.stream.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by za-zhangwei002 on 2018/10/8.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist {

    public Artist(String name, String from) {
        this.name = name;
        this.from = from;
    }

    private String name;

    private String from;

    private List<Artist> members;

}
