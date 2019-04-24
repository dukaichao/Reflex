package BIT.Reflex.reflect.BeanUtil1;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-24
 * Time:8:10
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException {
        Person p = new Person();
        BeanUtils.setXxx(p,"age",10);
        System.out.println(BeanUtils.getXxx(p,"address"));
    }
}
