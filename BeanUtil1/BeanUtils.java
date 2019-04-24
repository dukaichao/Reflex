package BIT.Reflex.reflect.BeanUtil1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-24
 * Time:8:10
 */
public class BeanUtils {

    /*
        setter方法
        o:要操作类的对象
        args:属性名
        attributeValue:属性值
     */
    public static void setXxx(Object o,String args,Object attributeValue){
        Class cls = o.getClass();
        //判断该属性是否存在
        Field field = null;
        try {
            field = cls.getDeclaredField(args);
            if(field == null){
                field = cls.getField(args);
            }
            if(field == null){
                return;
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        String fieldName = "set"+args.substring(0,1).toUpperCase()+(args.length()>1?args.substring(1):"");
        Method method = null;
        try {
            method = cls.getMethod(fieldName,attributeValue.getClass());
            method.invoke(o,attributeValue);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /*
        getter方法
        o:要操作类的对象
        args:属性名
     */
    public static <T> T getXxx(T o,String args) throws NoSuchFieldException {
        Class cls = o.getClass();
        //判断该属性是否存在
        Field field = field = cls.getDeclaredField(args);
        if(field == null){
            field = cls.getField(args);
        }
        if(field == null){
            return null;
        }


        String fieldName = "get"+args.substring(0,1).toUpperCase()+(args.length()>1?args.substring(1):"");
        Method method = null;
        try {
            method = cls.getMethod(fieldName);
            return (T)method.invoke(o);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
