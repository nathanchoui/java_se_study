package personal.nathan.others;

import java.util.Objects;
import java.util.Random;

/**
 * Description:
 *
 * Created by zhangwei on 2018/6/14.
 */
public class ObjectEqualsTest {

    public static class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Person)) {
                return false;
            }
            Person person = (Person) o;
            return Objects.equals(getName(), person.getName());
        }

        @Override
        public int hashCode() {
            return new Random().nextInt(1000);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("a");
        Person p2 = new Person();
        p2.setName("a");

        // 不会调用equals方法。
        System.out.println("用==判断: " + (p1 == p2));

        System.out.println("用equals判断: " + (p1.equals(p2)));
        //System.out.println(array[0].getName() + " | " + array[1].getName());
    }

}
