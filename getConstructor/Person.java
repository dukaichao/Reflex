package BIT.Reflex.reflect.getConstructor;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:21:31
 */
public class Person {

    private String name;
    private int age;
    private boolean b;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean b) {
        this.name = name;
        this.age = age;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
