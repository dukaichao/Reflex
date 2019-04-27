package BIT.Reflex.reflect.reflexproxyI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-27
 * Time:14:31
 */
public class Factory {
    private Factory(){}

    public static <T> T getInstance(String classname){
        T t = null;
        try {
            t = (T) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> T getInstance(String classname,Object obj){
        T t = null;
        try {
            Constructor<?> cons = Class.forName(classname).getConstructor(obj.getClass().getInterfaces()[0]);
            t = (T)cons.newInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> T getInstance1(String proxyName,String realName){
        T t = null;
        //真实类的对象
        T obj = getInstance(realName);
        try {
            Constructor<?> cons = Class.forName(proxyName).getConstructor(obj.getClass().getInterfaces()[0]);
            t = (T)cons.newInstance(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return t;
    }
}
