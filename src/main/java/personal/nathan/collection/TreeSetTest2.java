package personal.nathan.collection;

import java.util.*;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/26.
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        TreeSet<Integer> numSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
            int num = random.nextInt(100);
            numList.add(num);
            numSet.add(num);
        }
        System.out.println("list: " + numList);
        // 按照升序排列
        System.out.println("treeset: " + numSet);

        System.out.println(numSet.higher(20));

    }
}
