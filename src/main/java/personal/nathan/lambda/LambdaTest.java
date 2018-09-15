package personal.nathan.lambda;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/23.
 */
public class LambdaTest {

    public interface IntComsumer {
        void accept(int value);
    }

    public static void repeat(int n, IntComsumer comsumer) {
        for (int i = 0; i < n; i ++) {
            comsumer.accept(i);
        }
    }

    public static void main(String[] args) {
        //repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
        // 方法引用无法对传入的参数做处理
        repeat(10, System.out::println);
        System.out.println("*--------------------*");
        // 这种方式可对传入参数做处理
        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
        System.out.println("*--------------------*");
        // 传统方式调用
        repeat(10, new IntComsumer() {
            @Override
            public void accept(int value) {
                System.out.println("Countdown: " + (9 - value));
            }
        });
    }
}
