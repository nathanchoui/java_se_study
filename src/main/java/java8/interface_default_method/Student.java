package java8.interface_default_method;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/12/2.
 */
public class Student implements Named, Person {

    @Override
    public String getName() {
        return "student";
    }
}
