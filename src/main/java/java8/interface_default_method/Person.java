package java8.interface_default_method;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/12/2.
 */
public interface Person {

    default String getName() {
        return "person, by default";
    }
}
