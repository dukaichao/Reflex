package BIT.Reflex.reflect.BeanUtil;

import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-22
 * Time:22:39
 */
public class Source {
    private String name;
    private String address;
    private Integer age;
    private Date birthday;
    public Source(){}

    public Source(String name, String address, Integer age, Date birthday) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
