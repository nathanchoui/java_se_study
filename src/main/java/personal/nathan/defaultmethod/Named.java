package personal.nathan.defaultmethod;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/12/2.
 */
public interface Named {
    default String getName() {
        return "nathan, by default";
    }
}
