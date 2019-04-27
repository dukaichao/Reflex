package BIT.Reflex.reflect.reflexproxyI;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:14:31
 */
public class Test {
    public static void main(String[] args) {
       /* ISubject subject = Factory.getInstance("BIT.Reflex.reflect.reflexproxyI.ProxySubject",
                Factory.getInstance("BIT.Reflex.reflect.reflexproxyI.RealSubject"));
        subject.eat();*/

        ISubject subject1 = Factory.getInstance1("BIT.Reflex.reflect.reflexproxyI.ProxySubject",
                "BIT.Reflex.reflect.reflexproxyI.RealSubject");
        subject1.eat();
    }
}
