package personal.nathan.lambda;

import java.util.*;

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
        // first和second是通过类型推倒出来的，必然是String
        // BiFunction(T, U, R)
        Arrays.sort(arrays, (first, second)
                -> first.length() - second.length()
        );

        // 方法引用
        //Arrays.sort(arrays, String::compareToIgnoreCase);

        // Predicate
        List<String> list = new ArrayList<>();
        list.removeIf(e -> e == null);

        // 分隔符:: 方法调用。
        // object

        System.out.println(Arrays.toString(arrays));



    }
}
