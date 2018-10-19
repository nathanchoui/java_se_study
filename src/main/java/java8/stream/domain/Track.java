package java8.stream.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by za-zhangwei002 on 2018/10/9.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Track {
    private String name;

    private int length;

    private boolean solo;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }
}
