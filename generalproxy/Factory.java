package BIT.Reflex.reflect.generalproxy;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:13:59
 */
public class Factory {
    public static ISubject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}
