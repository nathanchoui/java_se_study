package personal.nathan.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/12/4.
 */
public class Main {

    public static void main(String[] args) {

        String[] arrays = {"peter", "mike", "linda", "mary"};
        // 匿名实现类方式
        /*
        Arrays.sort(arrays, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return first.length() - second.length();
            }
        });
        */

        // lambda表达式方式
//        Arrays.sort(arrays, (String first, String second)
//                -> first.length() - second.length()
//        );

        // 方法引用
        Arrays.sort(arrays, String::compareToIgnoreCase);

        for (String name: arrays) {
            System.out.println(name);
        }
    }
}
