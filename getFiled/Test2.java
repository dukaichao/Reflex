package BIT.Reflex.reflect.getFiled;

import java.lang.reflect.Field;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:19:54
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class cls = Son.class;
        //实例化本类对象
        Object obj = cls.newInstance();
        //操作salary属性
        Field field = cls.getField("salary");
        //包名.类名
        System.out.println(field.getType().getName());
        System.out.println(field.getType().getSimpleName());
    }
}
