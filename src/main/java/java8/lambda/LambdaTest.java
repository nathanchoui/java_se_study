package java8.lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/9/2.
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("自然顺序");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("按字母长度排序");
        // Lambda方式
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        // 匿名实现类
        Arrays.sort(planets, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return first.length() - second.length();
            }
        });
        System.out.println(Arrays.toString(planets));

        /*
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        */

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);





    }
}
