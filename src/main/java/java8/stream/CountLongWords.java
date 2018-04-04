package java8.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/2/27.
 */
public class CountLongWords {

    public static void main(String[] args) throws IOException {

        String contents = new String(Files.readAllBytes(Paths.get("C:\\Users\\natha\\Desktop\\The Friends of Voltaire.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));
        long count = 0;

        // 普通迭代方式
        for (String w: words) {
            if (w.length() > 12) count ++;
        }
        System.out.println(count);

        // 使用流的方式
        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);
    }
}
