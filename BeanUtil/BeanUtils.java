package BIT.Reflex.reflect.BeanUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:20:50
 */
public class BeanUtils {
    /**
     * 对象的属性值拷贝
     * <p>
     * 将source对象中的属性值赋值到target对象中的属性，属性名一样，类型一样
     * <p>
     * example:
     * <p>
     * source:
     * <p>
     * String name;
     * String address;
     * Integer age;
     * Date   birthday;
     * <p>
     * target:
     * String name;
     * String address;
     * String email
     * <p>
     * 结果： source name, address -> target name, address
     *
     * @param source
     * @param target
     */
    /*
        1.获取f类的属性名加入到集合A中
        2.获取s类的属性名加入到集合B中
        3.判断集合A是否包含集合B中的属性，如果包含，判断二者的属性类型是否相同，
        如果相同将集合A中的该属性值赋给集合B中的该属性
     */
    public static void copy(Object s, Object t) {
        //TODO
        List<String> list_s = new ArrayList<>();
        List<String> list_t = new ArrayList<>();
        //获取s的Class对象
        Class clss = s.getClass();
        //获取t的Class对象
        Class clst = t.getClass();
        //获取s中所有属性，并加入到集合list_s中
        Field[] fields = clss.getDeclaredFields();
        for(Field ff : fields){
            list_s.add(ff.getName());
        }
        //获取t中所有属性，并加入到集合list_t中
        Field[] fieldt = clst.getDeclaredFields();
        for(Field ff : fieldt){
            list_t.add(ff.getName());
        }
        //遍历list_t集合，在list_s集合中查找是否含有t的属性
        for(String ss : list_t){
            if(list_s.contains(ss)&&isEqualFieldType(s,t,ss)){
                sCopyt(s,t,ss);
            }
        }

    }
    //将s中的属性值赋给t的属性值
    public static void sCopyt(Object o1,Object o2,String s){
        Class cls1 = o1.getClass();
        Class cls2 = o2.getClass();
        try {
            Field f1 = cls1.getDeclaredField(s);
            Field f2 = cls2.getDeclaredField(s);
            f1.setAccessible(true);
            f2.setAccessible(true);
            f2.set(o2,f1.get(o1));
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    //判断二者属性类型是否相同
    public static boolean isEqualFieldType(Object o1,Object o2,String s){
        Class cls1 = o1.getClass();
        Class cls2 = o2.getClass();
        try {
            Field f1 = cls1.getDeclaredField(s);
            Field f2 = cls2.getDeclaredField(s);
            if(f1.getType().getName().equals(f2.getType().getName())){
                return true;
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return false;

    }
}
