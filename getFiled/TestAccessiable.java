package BIT.Reflex.reflect.getFiled;

import java.lang.reflect.Field;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:19:16
 */
public class TestAccessiable {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("BIT.Reflex.reflect.getFiled.Son");
            //实例化本类对象
            Object obj = cls.newInstance();
            //获取id属性
            Field field = cls.getDeclaredField("id");
            //设置封装性true为可见，false为不可见
            field.setAccessible(true);
            field.set(obj,10011);
            System.out.println(field.get(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
