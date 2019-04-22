package BIT.Reflex.reflect.getFiled;

import java.lang.reflect.Field;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:18:16
 */
public class Test1 {
    public static void main(String[] args) {

        Class cls = Son.class;
        Field[] fields = cls.getDeclaredFields();
        for(Field ff : fields){
            System.out.println(ff.getType());
        }

        Field ff = null;
        try {
            ff  = cls.getDeclaredField("id");
            System.out.println(ff.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
