package java8.stream.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Created by za-zhangwei002 on 2018/10/16.
 */
public class StreamExercise3 {

    // 计算一个字符串中小写字母的个数（提示：参阅String 对象的chars 方法）。
    public static int countLowercaseLetters(String string) {
        return (int) string.chars() // 转换成IntStream
                .filter(Character::isLowerCase) // 过滤
                .count();
    }

    // 在一个字符串列表中，找出包含最多小写字母的字符串。对于空列表，返回Optional<String> 对象
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparing(StreamExercise3::countLowercaseLetters));
    }
}

