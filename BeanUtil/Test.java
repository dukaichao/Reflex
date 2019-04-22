package BIT.Reflex.reflect.BeanUtil;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:22:39
 */
public class Test {
   /* public static void main(String[] args) {
        System.out.println(new Date().toString());
    }*/
    public static void main(String[] args) {
        Class cls1 = Target.class;
        Class cls2 = Source.class;
        try {
            Object obj1 = cls1.newInstance();
            Object obj2 = cls2.newInstance();
            Field f1 = cls2.getDeclaredField("name");
            Field f2 = cls2.getDeclaredField("address");
            Field f3 = cls2.getDeclaredField("age");
            Field f4 = cls2.getDeclaredField("birthday");
            f2.setAccessible(true);
            f1.setAccessible(true);
            f3.setAccessible(true);
            f4.setAccessible(true);
            f1.set(obj2,"杜子腾");
            f2.set(obj2,"寒寨");
            f3.set(obj2,18);
            f4.set(obj2,new Date(2012-12-13));
            BeanUtils.copy(obj2,obj1);
            System.out.println(obj1);


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
