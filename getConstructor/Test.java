package BIT.Reflex.reflect.getConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:21:30
 */
class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
}
public class Test {
    public static void main(String[] args) {
        Class classz = Person.class;
        try {
            //获取指定参数类型的构造(公有的)
            Constructor cons = classz.getConstructor(String.class,int.class);
            System.out.println(cons);
            //获取公有所有构造
            Constructor[] c1 = classz.getConstructors();
            for(Constructor cc: c1){
                System.out.println(cc);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
