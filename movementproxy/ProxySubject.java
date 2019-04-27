package BIT.Reflex.reflect.movementproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:16:52
 */
public class ProxySubject implements InvocationHandler {

    // 绑定任意接口的对象，使用Object描述    
    private Object target ;
    /**    
         实现真实对象的绑定处理，同时返回代理对象    
         @param target    
         @return 返回一个代理对象(这个对象是根据接口定义动态创建生成的代理对象)    
     */
    public Object bind(Object target) {
        // 保存真实主题对象
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    public void preHandle() {
        System.out.println("[ProxySubject] 方法处理前");
    }

    public void afterHandle(){
        System.out.println("[ProxySubject] 方法处理后");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.preHandle();
        Object obj = method.invoke(target,args);
        this.afterHandle();
        return obj;
    }
}
