package BIT.Reflex.reflect.reflexproxyI;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:14:30
 */
public class RealSubject implements ISubject {
    @Override
    public void eat() {
        System.out.println("吃卤菜");
    }
}
