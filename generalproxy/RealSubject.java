package BIT.Reflex.reflect.generalproxy;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:13:58
 */
public class RealSubject implements ISubject{

    @Override
    public void buyComputer() {
        System.out.println("买电脑");
    }
}
