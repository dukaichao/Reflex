package BIT.Reflex.reflect.movementproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:15:54
 */
public class Test {
    public static void main(String[] args) {
        ISubject subject =(ISubject) new ProxySubject().bind(new RealSubject());
        subject.eat("zz",20);
        ITest iTest = (ITest)new ProxySubject().bind(new RealSubject());
        iTest.play();
    }
}
