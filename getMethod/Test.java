package BIT.Reflex.reflect.getMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:0:00
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Class cls = p.getClass();
        //获取该类所有公有方法
       /* Method[] method = cls.getMethods();
        for(Method mm : method){
            System.out.println(mm);
        }*/
        //通过反射调用setter和getter方法
        try {
            Class classz = Class.forName("BIT.Reflex.reflect.getMethod.Person");
            //任何时候调用类中的普通方法都必须有实例化对象
            Object obj = classz.newInstance();
            System.out.println(obj);
            //取得setName这个方法的实例化对象，设置方法名字和参数了类型
            Method setMethod = classz.getMethod("setName",String.class);
            //随后需要通过Method类对象调用指定方法，调用方法需要有实例化对象
            //同时传入参数
            setMethod.invoke(obj,"dzt");
            Method getMethod = classz.getMethod("getName");
            Object result = getMethod.invoke(obj);
            System.out.println(result);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
