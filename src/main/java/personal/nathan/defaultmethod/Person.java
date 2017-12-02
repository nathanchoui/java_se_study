package personal.nathan.defaultmethod;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/12/2.
 */
public interface Person {

    default String getName() {
        return "Person";
    }
}
