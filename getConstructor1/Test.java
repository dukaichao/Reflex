package BIT.Reflex.reflect.getConstructor1;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:23:33
 */
public class Test {
    public static void main(String[] args) {
        Class cls = Person.class;
        try {
            Constructor con = cls.getConstructor(String.class,int.class,char.class);
            System.out.println(con.newInstance("son",18,'男'));

            System.out.println(cls.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
