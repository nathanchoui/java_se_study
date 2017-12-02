package personal.nathan.defaultmethod;

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
