package BIT.Reflex.reflect.movementproxy;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:16:52
 */
public class RealSubject implements ISubject,ITest{
    @Override
    public void eat(String msg, int num) {
        System.out.println("我要吃 "+num + "分量的 "+msg) ;
    }

    @Override
    public void play() {
        System.out.println("玩吉尔");
    }
}
