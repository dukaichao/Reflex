package BIT.Reflex.reflect.getFiled;

import java.lang.reflect.Field;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:21:59
 */
public class Test3 {
    public static void main(String[] args) {
        Class cls = Son.class;
        try {
            Object obj = cls.newInstance();
            Field field = cls.getDeclaredField("salary");
            Object o = field.getType();
            field.setAccessible(true);
            field.set(obj,10.0);
            System.out.println(field.get(obj).getClass());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
