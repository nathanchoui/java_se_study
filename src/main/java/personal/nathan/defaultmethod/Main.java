package personal.nathan.defaultmethod;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/12/2.
 */
public class Main {

    public static void main(String[] args) {
        // 测试接口默认方法，实现类并没有实现方法。
        // 默认调用接口的默认实现，并且实现类不覆盖接口方法也不会报错。
        Named named = new NamedImpl();
        System.out.println(named.getName()); // nathan, by default

        // Student 同时实现了 具有相同方法名和签名的接口
        // 无论接口是否提供默认方法，实现类必须覆盖。
        Named student = new Student();
        System.out.println(student.getName());

        // Staff 继承了一个类，实现了一个类，类优先原则，不用实现该方法。
        Staff staff = new Staff();
        System.out.println(staff.getName());

    }
}
