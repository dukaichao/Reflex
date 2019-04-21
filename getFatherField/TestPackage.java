package BIT.Reflex.reflect.getFatherField;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:20:49
 */
/*

 */
public class TestPackage {
    public static void main(String[] args) {
        Class classz = Son.class;
        //获取父类的class对象:class+包名+类名
        System.out.println(classz.getSuperclass());
        //获取父类名称：包名+类名
        System.out.println(classz.getSuperclass().getName());
        //获取父类名：类名
        System.out.println(classz.getSuperclass().getSimpleName());
        //取得实现父接口的对象
        Class[] obj = classz.getInterfaces();
        for(Class c:obj){
            System.out.println(c.getSimpleName());
        }
        //获取包名称：package + 包名
        System.out.println(classz.getPackage());
        //获取包名：包名
        System.out.println(classz.getPackage().getName());
    }
}
