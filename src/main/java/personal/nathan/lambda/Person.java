package personal.nathan.lambda;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/12/2.
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
