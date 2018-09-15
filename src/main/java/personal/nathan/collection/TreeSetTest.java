package personal.nathan.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/3.
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(Comparator.comparing(String::length));
        names.add("blackaa");
        names.add("adelesd");
        names.add("smile456ff");
        names.add("crack");



        for (String name: names) {
            System.out.println(name);
        }

        Map<String, Integer> ages = new HashMap();
        ages.put("nathan", 28);
        ages.put("winky", 18);
        ages.put("chris", 45);
        ages.forEach((k, v) ->
            System.out.println("key: " + k + ", value: " + v)
        );

        ages.merge("nathan", 1, Integer::sum);
        System.out.println(ages.get("nathan"));

    }


}
