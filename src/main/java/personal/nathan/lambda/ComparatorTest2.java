package personal.nathan.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/23.
 */
public class ComparatorTest2 {

    public static void main(String[] args) {
        Person[] persons = makePersons();
        // 根据名字自然排序, Function(T, U)函数式
        Arrays.sort(persons, Comparator.comparing(Person::getName).thenComparing((t, u) -> t.getName().length() - u.getName().length()));
        System.out.println(Arrays.toString(persons));




    }

    public static Person[] makePersons() {
        Person p1 = new Person();
        p1.setName("Nathan");
        Person p2 = new Person();
        p2.setName("Mary");
        Person p3 = new Person();
        p3.setName("Clair");
        Person p4 = new Person();
        p4.setName("Underwood");
        Person p5 = new Person();
        p5.setName("Sky");
        Person p6 = new Person();
        p6.setName("Michael");
        return new Person[]{p1, p2, p3, p4, p5, p6};
    }
}
