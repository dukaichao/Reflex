package BIT.Reflex.reflect.getFiled;

import java.lang.reflect.Field;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:18:47
 */
public class Test {
    public static void main(String[] args) {
        Class cls = Son.class;
        //对类的成员进行操作必须初始化对象
        Object obj = null;
        try {
            //实例化本类对象
            obj = cls.newInstance();
            //操作name属性
            Field field = cls.getField("name");
            field.set(obj,"瑶娃");   //相当于new Son().name = "瑶娃"
            System.out.println(field.get(obj));    //取得属性
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
