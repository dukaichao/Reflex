package BIT.Reflex.reflect.BeanUtil1;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-24
 * Time:8:10
 */
public class Person {

    private String name;
    private String address;
    private Integer age;
    private Integer id;


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
